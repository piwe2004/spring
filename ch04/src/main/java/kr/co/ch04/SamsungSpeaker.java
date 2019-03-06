package kr.co.ch04;

import org.springframework.stereotype.Component;

@Component
public class SamsungSpeaker implements Speaker {
	
	@Override
	public void VolumeUp() {
		System.out.println("소리를 올립니다!");
	}
	
	@Override
	public void VolumeDown() {
		System.out.println("소리를 줄입니다!");
	}
}
