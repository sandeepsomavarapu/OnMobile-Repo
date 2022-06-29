package com.onmobile.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Employee emp = new Employee(123, "suresh", 20000);
//
//		FileOutputStream out = new FileOutputStream("empinfo.txt");
//		ObjectOutputStream obj = new ObjectOutputStream(out);
//		obj.writeObject(emp);
//		
		
		
		FileInputStream stream=new  FileInputStream("empinfo.txt");
		ObjectInputStream obj1=new ObjectInputStream(stream);
		Employee emp1=(Employee) obj1.readObject();
		System.out.println(emp1);
	}
}
