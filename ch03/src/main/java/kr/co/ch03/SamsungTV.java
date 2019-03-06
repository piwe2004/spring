package kr.co.ch03;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private Internet internet;
	
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	// setter�� ���� ��ü ����
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	
	@Override
	public void power() {
		System.out.println("Samsung TV ���� ��!");
	}
	
	public void chUp() {
		System.out.println("Samsung TV ä�� �ø�");
	}
	
	public void chDown() {
		System.out.println("Samsung TV ä�� ����");
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
