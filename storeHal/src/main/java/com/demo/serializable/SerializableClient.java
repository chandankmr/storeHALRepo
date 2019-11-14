package com.demo.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableClient {

	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException{
		LazySingleton singletonInstance=LazySingleton.getInstance();
		
		try(ObjectOutput out=new ObjectOutputStream(new FileOutputStream("file.ser"))){
			
			out.writeObject(singletonInstance);
						
			
		}
		
		System.out.println("Serialization phase : hashcode="+singletonInstance.hashCode());
		
	try(ObjectInput in=new ObjectInputStream(new FileInputStream("file.ser"))){
			
		singletonInstance=(LazySingleton)in.readObject();			
			
		}
	
	System.out.println("Deserialization phase : hashcode="+singletonInstance.hashCode());

	}

}
