package inheritance;

public class Shape {
	int x;
	int y;
	
	public Shape() {
		System.out.println("Shape default contstructor");
	}
	
	public Shape(int x, int y) {
		System.out.println("Shape Argument contstructor");
		this.x=x;
		this.y=y;
	}
	
	public void show() {
		System.out.printf("(x,y): (%d,%d)\n", this.x,this.y);
	}
}
