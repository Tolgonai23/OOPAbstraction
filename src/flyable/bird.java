package flyable;

public class bird implements flyable,sound {
      
	@Override
       public void fly() {
    	   System.out.println("Fly like bird ");
       }
       
       @Override
       public void sounds() {
    	   System.out.println(" chik chik");
       }
       
}
