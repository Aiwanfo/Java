
public class Rectangle {
	/** The width and height of a rectangle */
	  double width;
	  double height;

	  /** The number of the objects created */
	  static int numberOfObjects = 0;

	  /** Construct a rectangle with width & height 1 */
	 public Rectangle() {
	    width = 1.0;
	    height = 1.0;
	    numberOfObjects++;
	  }

	  /** Construct a rectangle with a specified width & height */
	  public Rectangle(double newwidth, double newheight){
	    width = newwidth;
	    height = newheight;
	    numberOfObjects++;
	  }

	  /** Return numberOfObjects */
	  static int getNumberOfObjects() {
	    return numberOfObjects;
	  }

	  /** Return the width & height of this Rectangle */
	  double getArea() {
	    return width * height;
	}
	  double getPerimeter() {
		  return 2*(width + height);
	}

	  public static void main(String[] args) {
		  Rectangle rectangleOne = new Rectangle();
		  Rectangle rect = new Rectangle(4.0,40.0);
		  
		  /**Print out Area and Perimeter */
		  System.out.print("Area is " + rectangleOne.getArea() + " \nPerimeter is " + rect.getPerimeter());
	  }
	  
}
