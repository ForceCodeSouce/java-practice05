package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub

		if (function.equals("음악")) {
			System.out.println("다운로드해서 음악재생");
		}

		if (function.equals("앱")) {
			System.out.println("앱시작");
		}

		if (function.equals("통화")) {
			System.out.println("통화기능시작");
		}
	}

	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		super.playMusic();
	}

}
