package prob2;

public class MusicPhone extends Phone {
	
	public void excute(String function) {
		if(function.equals("음악")) {
			playMusic();
			return;
		}
		
		super.execute(function);
	}
	
	protected void playMusic() {
		System.out.println("MP3 플레이어에서 음악재생");
	}
	
}
