package interfaceExample;

import java.util.List;

public abstract class phone implements faceReconation, memory {
       
	abstract void hi() ;
List contactList;
public String name;
public String model;
public int memory;
    
public abstract void lock();
 public abstract void call(int number);
 public abstract void text();
 public abstract void takePicture();

}
