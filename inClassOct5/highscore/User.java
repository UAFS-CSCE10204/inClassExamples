package highscore;

import java.io.Serializable;

public class User implements Serializable {
	private int noTurns;
	private String name;
	
	public User() {}
	
	public User(int noTurns, String name) {
		this.setName(name);
		this.setNoTurns(noTurns);
	}
	
	public int getNoTurns() {
		return noTurns;
	}
	public void setNoTurns(int noTurns) {
		this.noTurns = noTurns;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
