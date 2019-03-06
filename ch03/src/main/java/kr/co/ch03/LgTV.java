package kr.co.ch03;

public class LgTV implements TV{
	
	private Speaker speaker;
	private Internet internet;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	// setter를 통한 객체 주입
	public LgTV(Internet internet) {
		this.internet = internet;
	}
	
	@Override
	public void power() {
		System.out.println("LG TV 전원 켬!");
	}
	
	public void chUp() {
		System.out.println("LG TV 채널 올림");
	}
	
	public void chDown() {
		System.out.println("LG TV 채널 내림");
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
