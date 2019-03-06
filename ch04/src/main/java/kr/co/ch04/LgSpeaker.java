package kr.co.ch04;

import org.springframework.stereotype.Component;

@Component
public class LgSpeaker implements Speaker {
	
	@Override
	public void VolumeUp() {
		System.out.println("�Ҹ��� �ø��ϴ�!");
	}
	
	@Override
	public void VolumeDown() {
		System.out.println("�Ҹ��� ���Դϴ�!");
	}
	
}
