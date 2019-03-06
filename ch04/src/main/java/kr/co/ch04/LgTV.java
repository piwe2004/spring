package kr.co.ch04;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV{
	
	@Resource(name="lgSpeaker")
	private Speaker speaker;
	@Autowired
	private Internet internet;
		
	@Override
	public void power() {
		System.out.println("LG TV ���� ��!");
	}
	
	public void chUp() {
		System.out.println("LG TV ä�� �ø�");
	}
	
	public void chDown() {
		System.out.println("LG TV ä�� ����");
	}

	public void VolumeUp() {
		speaker.VolumeUp();
	}
	
	public void VolumeDown() {
		speaker.VolumeDown();
	}
	
	public void connect() {
		internet.connect();
	}
	
	public void disconnect() {
		internet.disconnect();
	}

}
