package interfaceExample;

public class Chick{
	
   private String name= "Fluffy ";
   {
	    System.out.println(" setting field");
	   }
   public Chick () {
	   name= " Toko";
	   System.out.println(" setting constructor ");
   }
     public static void main (String[]args) {
    	 Chick chick=new Chick();
    	 System.out.println(chick.name);
     
	}
   }
           


