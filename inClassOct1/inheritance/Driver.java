package inheritance;

public class Driver {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		Circle circle = new Circle(10,10,50);
		Square square = new Square(100,100,40);
		
		shape.show();
		circle.show();
		square.show();

	}

}
