package highscore;

public class HighScore {
	private User[] users;
	
	public HighScore() {
		users = new User[5];
	}
	
	public void loadFile() {
		
	}
	
	public void saveFile() {
		
		
	}
	
	public void saveScore(User[] array, User user) {
		int index;
		User temp;
		
		for(index=0;index<array.length;index++) {
			if(array[index]!=null) {
				if(user.getNoTurns()<array[index].getNoTurns()) {
					temp=array[index];
					array[index]=user;
					user=temp;
				}				
			}else {
				array[index]=user;
				user=null;
			}
		}
	}
	
	public void show(User[] users) {
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
}
