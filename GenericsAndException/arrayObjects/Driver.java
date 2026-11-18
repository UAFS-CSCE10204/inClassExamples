package arrayObjects;

public class Driver {

	public static void main(String[] args) {
		Objects items = new Objects();
		
		
		items.append("This is a test");
		items.append("This is a big test");
		items.append("This is a bigger test");
		items.append("This is a huge test");
		
		String str = (String) items.get(0);
		
		items.show();

	}

}
