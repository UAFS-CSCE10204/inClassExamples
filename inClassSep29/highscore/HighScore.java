package highscore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HighScore {
	private User[] users;
	private String filename;
	
	public HighScore() {
		users = new User[5];
		this.filename="users.dat";
	}
	
	public void loadFile() {
		FileInputStream inFile;
		ObjectInputStream in;
		
		try {
			inFile = new FileInputStream(this.filename);
			in = new ObjectInputStream(inFile);
			this.users = (User[]) in.readObject();
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveFile() {
		FileOutputStream outFile;
		ObjectOutputStream out;
		
		try {
			outFile = new FileOutputStream(this.filename);
			out = new ObjectOutputStream(outFile);
			out.writeObject(users);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
