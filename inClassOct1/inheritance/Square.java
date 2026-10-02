package inheritance;

public class Square extends Shape {
	int side;

	public Square() {
		System.out.println("Square Default Constructor");
		this.side=10;
	}
	
	public Square(int x, int y, int side) {
		super(x,y);
		System.out.println("Square Arguments Constructor");
		this.side=side;
	}
}
