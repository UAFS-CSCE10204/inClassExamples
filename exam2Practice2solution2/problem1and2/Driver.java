package problem1and2;

import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) throws IOException {
		Security security = new Security();
		security.loadUsers();
		security.showUsers();
	}
}
