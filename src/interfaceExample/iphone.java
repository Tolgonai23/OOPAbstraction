package interfaceExample;

public class iphone extends phone {

	@Override
	public void location() {
		System.out.println(" Chicago");
		
	}

	@Override
	public void capacity() {
		System.out.println("Iphone capacity");
		
	}

	@Override
	void hi() {
		System.out.println(" say hello");
		
	}

	@Override
	public void lock() {
		System.out.println("Iphone is locked");
		
	}
	@Override
	public void call( int  number) {
		
	System.out.println("calling number "+ number);
		
	}

	@Override
	public void text() {
		System.out.println(" iphone is texting ");
		
	}

	@Override
	public void takePicture() {
		System.out.println("iphone is taking picture ");
		
	
		
		
	}

	@Override
	public String faceID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void call1(long number) {
		// TODO Auto-generated method stub
		
	}

	

}
