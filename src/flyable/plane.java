package flyable;

public class plane implements flyable, sound {
     @Override
     public void sounds () {
    	 System.out.println("noisy");
     }
     @Override
     public void fly() {
    	 System.out.println("Fly ");
     }
}
