package shapes;

public abstract class Shape extends SuperShape {
      String name;
      double area;
      
       public Shape(String string) {
		// TODO Auto-generated constructor stub
	}
	public abstract double  calculateArea();
     
	     public void draw() {
       }
       public void Shape (String name) {
    	   this.name=name;
    	   
       }
}
