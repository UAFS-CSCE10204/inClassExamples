package highscore;

public class Driver {

	public static void main(String[] args) {
		
		HighScore hs = new HighScore();
		/*
		hs.saveScore(new User(10,"Joe"));
		hs.saveScore(new User(5,"Bill"));
		hs.saveScore(new User(8,"Jack"));*/
		hs.loadFile();
		hs.show();
		// hs.saveFile();
	}

}
