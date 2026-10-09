package problem1and2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Security {
	User[] users;
	int count;
	String fileName;
	
	public Security() {
		this.users = new User[100];
		this.fileName="users.txt";
	}
	
	public void showUsers() {
		int index;
		
		System.out.printf("%-10s %-15s %-50s\n","UserName","Password","EMail");
		System.out.printf("%-10s %-15s %-50s\n","---------","-----------","----");
		for(index=0;index<this.count;index++) {
			System.out.printf("%-10s %-15s %-50s\n", this.users[index].getUserName(),this.users[index].getPassword(),
					this.users[index].getEmail());
		}
	}
	
	public void loadUsers() throws IOException {
		Scanner fromFile = new Scanner(new File(this.fileName));
		String[] fields;
		String buffer;
		User user;
		
		fromFile.nextLine();
		while(fromFile.hasNextLine()) {
			buffer = fromFile.nextLine();
			fields = buffer.split(",");
			user = new User();
			user.setUserName(fields[0]);
			user.setEmail(fields[1]);
			user.setPassword(fields[2]);
			this.users[count++]=user;
		}
		fromFile.close();
		
		return;
	}
}
