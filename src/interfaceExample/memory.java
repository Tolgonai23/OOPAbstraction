package interfaceExample;

public interface memory  extends faceReconation{
  int MEMORY=128;
   public static final int SIZE=8;
       void location ();
       void capacity();
       public static void staticMethod() {
    	   System.out.println("Interface static method.");
       }
       default void defaultMethod() {
    	   System.out.println("Interface default method.");
       }
	void call1(long number);
}
