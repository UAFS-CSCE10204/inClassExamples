package inheritance;

public class Circle extends Shape {
	int diameter;
	
	public Circle() {
		System.out.println("Circle default contstructor");
	}
	
	public Circle(int diameter, int x, int y) {
		super(x,y);
		System.out.println("Circle Argument contstructor");
		this.diameter=diameter;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.printf("Diameter: %d\n", this.diameter);
	}
}
