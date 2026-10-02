package inheritance;

public class Circle extends Shape {
	int diameter;
	
	public Circle() {
		this.diameter=10;
		System.out.println("Circle Default Constructor");
	}
	
	public Circle(int x, int y, int diameter) {
		super(x,y);
		System.out.println("Circle Arguments Constructor");
		this.diameter=diameter;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.printf("Diameter: %d\n", this.diameter);
	}

}
