package highscore;

public class Driver {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User(5,"Colby");
		users[1] = new User(8,"Jon");
		users[2] = new User(15,"Oyuki");
		show(users);
		
		User user = new User(7,"Clint");
		saveScore(users,user);
		show(users);
		
	}
	
	public static void saveScore(User[] array, User user) {
		
	}
	
	public static void show(User[] users) {
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
