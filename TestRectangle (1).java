/* Test Rectangle */
public class TestRectangle {
	  public static void main(String[] args) {
		  Rectangle rectangleOne = new Rectangle();
		  Rectangle rect = new Rectangle(4.0,40.0);
		  
		  /**Print out Area and Perimeter */
		  System.out.print("Area of first is " + rectangleOne.getArea() +
				  " \nPerimeter of second is " + rect.getPerimeter());
	  }
	  
}
