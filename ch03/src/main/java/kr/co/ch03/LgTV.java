package kr.co.ch03;

public class LgTV implements TV{
	
	private Speaker speaker;
	private Internet internet;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	// setter�� ���� ��ü ����
	public LgTV(Internet internet) {
		this.internet = internet;
	}
	
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
