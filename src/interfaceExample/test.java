package interfaceExample;

public class test {
public static void main (String [] args) {
	iphone ip=new iphone();
	ip.call(267375);
	System.out.println(ip.faceID());
	ip.hi();
	ip.location();
	samsung sam = new samsung();
	sam.hi();
	System.out.println(sam.faceID());
	System.out.println("==================");
	memory m1= new iphone();
	m1.faceID();
	int memory=((phone)m1).memory;
	
	phone p1 = new iphone();
	((memory)p1).location();
	
}
}
