package shapes;

public class Triangle extends Shape{
 
	  int len1;
	  int len2;
	  int len3;
	  
	  public Triangle(String name) {
		  super(name);
	  }

	@Override
	public double calculateArea() {
	
		return (len2*len3*(Math.sin(len1))/2);
	}
	  public void draw() {
		  System.out.println("Drawing triangle.");
	  }
	  }
