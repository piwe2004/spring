package kr.co.ch04;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV{
	
	@Resource(name="samsungSpeaker")
	private Speaker speaker;
	
	@Inject
	private Internet internet;
	
	
	@Override
	public void power() {
		System.out.println("Samsung TV 전원 켬!");
	}
	
	public void chUp() {
		System.out.println("Samsung TV 채널 올림");
	}
	
	public void chDown() {
		System.out.println("Samsung TV 채널 내림");
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
