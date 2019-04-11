package kr.co.mins.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;

import kr.co.mins.service.BoardService;
import kr.co.mins.vo.FileVO;
import kr.co.mins.vo.MemberVO;
import kr.co.mins.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	private Object uploaded;
		
	@RequestMapping("/list")
	public String list(Model model, String pg, String cate) {
				
		
		int start = service.getLimitStart(pg);
		
		int total = service.getTotalCount(cate);
		int pageEnd = service.getPageEnd(total);
		
		int count = service.getPageCountStart(total, start);
		
		int[] groupStartEnd = service.getPageGroupStartEnd(pg, pageEnd);
		
		List<BoardVO> list = service.list(start, cate);
		
		model.addAttribute("list", list);
		model.addAttribute("total", total);
		model.addAttribute("count", count);
		model.addAttribute("groupStartEnd", groupStartEnd);
		
		return "/"+cate+"/list";
	};
	
	
	  @RequestMapping(value="/write")
  		public String write(HttpServletRequest req) {
		  
		  String cate = req.getParameter("cate");
		  
		  return "/"+cate+"/write"; 
		  
	  	};
	 
	@RequestMapping(value="/write_result", method=RequestMethod.POST)
	public String writeResult(BoardVO vo, HttpServletRequest req, HttpSession sess, FileVO fvo, String cate) {
		
		MemberVO member = (MemberVO) sess.getAttribute("member");
		
		vo.setRegip(req.getRemoteAddr());
		vo.setUserid(member.getUserid());
		vo.setUsernick(member.getUsernick());
		
		MultipartFile file = vo.getFname();
		
		int parent = service.writeResult(vo);
		
		vo.setFile(service.fileUpload(vo, req, file, fvo));
		
		// 파일업로드 정보 테이블 저장
		
		//service.filewrite(parent);
		
		return "redirect:/list?cate="+cate;
	};

	@RequestMapping(value="/photoUpload", method=RequestMethod.GET)
	public void photoUpload (HttpServletRequest req, HttpServletResponse resp, @RequestParam MultipartFile upload) {
		
		OutputStream out = null;
		PrintWriter printWriter = null;
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		try {
			String fileName = upload.getOriginalFilename();
			byte[] bytes = upload.getBytes();
			String uploadPath = "/upload/" + fileName; //저장경로
			
			out = new FileOutputStream(new File(uploadPath));
			out.write(bytes);
			String callback = req.getParameter("CKEditorFuncNum");
			
			printWriter = resp.getWriter();
			String fileUrl = "/upload/" + fileName;
			
			printWriter.println("<script type='text/javascript'>window.parent.CKEDITOR.tools.callFunction("
					+ callback
					+ ","
					+ fileUrl
					+ "','이미지를 업로드 하였습니다."
					+ ")</script>");
			printWriter.flush();
			
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();
				}
				if (printWriter != null) {
					printWriter.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return;
	};
	
	/*
	 * public Map<String, Object> photoUpload() { Map<String, Object> map = new
	 * HashMap<String, Object>(); // 파일이 첨부되었을때 MultipartFile file = null; String
	 * oldName = file.getOriginalFilename(); String ext =
	 * oldName.substring(oldName.lastIndexOf("."));
	 * 
	 * // 고유파일명 생성 String fileName = UUID.randomUUID().toString()+ext;
	 * map.put("uploaded", uploaded); map.put("fileName", fileName); return map; };
	 */
	
	@RequestMapping("/view")
	public String view(int seq, Model model, String cate) {
		
		BoardVO vo = service.view(seq, cate);
		BoardVO pre = service.preview(seq, cate);
		BoardVO next = service.nextview(seq, cate);
		
		model.addAttribute("vo", vo);
		model.addAttribute("pre", pre);
		model.addAttribute("next", next);
		service.boardhit(seq, cate);
		
		if(vo.getFile() == 1) {
			FileVO fvo = service.view_file(seq, cate);
			model.addAttribute("fvo", fvo);
		}
		
		
		
		return "/"+cate+"/view";
	};
	
	@RequestMapping("/notice/modify")
	public String modify() {
		return "/notice/modify";
	};
	
	
}
