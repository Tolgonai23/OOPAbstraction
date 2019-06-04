package inheritance;

public class UsingInheritance {
     public static void main(String []args) {
    	 Person personObj= new Person();
    	 Student studentObj=new Student();
    	 System.out.println("Using person type  object");
    		 
    	 personObj.talk();
    	 personObj.walk();
    	 System.out.println("using student type object");
    	 
    	 studentObj.talk();
    	 studentObj.walk();
    	 studentObj.speak();
     }
}
