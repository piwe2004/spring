package kr.co.mins.vo;

import org.springframework.web.multipart.MultipartFile;
import kr.co.mins.vo.FileVO;

public class BoardVO {

	public int seq;
	public int parent;
	public int comment;
	public int notice_chk;
	public String title;	
	public String content;	
	public int file;	
	public int hit;	
	public String tag;	
	public String userid;	
	public String usernick;	
	public String regip;	
	public String rdate;
	public String cate;
	private FileVO fileVO;
	
	public FileVO getFileVO() {
		return fileVO;
	}
	public void setFileVO(FileVO fileVO) {
		this.fileVO = fileVO;
	}
	private MultipartFile fname;
	
	public MultipartFile getFname() {
		return fname;
	}
	public void setFname(MultipartFile fname) {
		this.fname = fname;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public int getNotice_chk() {
		return notice_chk;
	}
	public void setNotice_chk(int notice_chk) {
		this.notice_chk = notice_chk;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getFile() {
		return file;
	}
	public void setFile(int file) {
		this.file = file;
	}
	public int getHit() {
		return hit;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsernick() {
		return usernick;
	}
	public void setUsernick(String usernick) {
		this.usernick = usernick;
	}
	public String getRegip() {
		return regip;
	}
	public void setRegip(String regip) {
		this.regip = regip;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
}
