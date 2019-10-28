
public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.5,3.5,4.2);
		System.out.println(c1.distance(c2));

		//Test setters and getters
		c1.setRadius(2.2);
	    c1.setCenterX(3.2);
	    c1.setCenterY(4.5);
	    System.out.println("The radius is: " + c1.getRadius());
	    System.out.println("CenterX is: " + c1.getCenterX());
	    System.out.println("CenterY is: " + c1.getCenterY());
	    
	  //Test distance
	    System.out.println("the distance is: " + c1.distance(c2));
	}
}
