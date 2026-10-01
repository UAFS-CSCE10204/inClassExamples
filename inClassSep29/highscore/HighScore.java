package highscore;

public class HighScore {
	private User[] users;
	
	public HighScore() {
		users = new User[5];
	}
	
	public void show() {
		int index;
		
		System.out.printf("%-5s  %-10s\n","Turns","Name");
		System.out.printf("%-5s  %-10s\n","-----","----");
		for(index=0;index<users.length;index++) {
			if(users[index]!=null) {
				System.out.printf("%5d  %-10s\n", 
						users[index].getNoTurns(),users[index].getName());				
			}
		}	
	}
	
	public void saveScore(User user) {
		int index;
		User temp;
			
		for(index=0;index<this.users.length;index++) {
			if(this.users[index]!=null) {
				if(user.getNoTurns()<this.users[index].getNoTurns()) {
					temp = this.users[index];
					this.users[index]=user;
					user = temp;
				}
			}else {
				this.users[index]=user;
				user=null;
			}
		}
	}
}
