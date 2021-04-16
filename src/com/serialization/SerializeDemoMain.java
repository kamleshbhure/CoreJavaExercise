package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemoMain {
	
	public static void main(String[] args) {
		String fileName="student.ser";
		Student std = new Student(120, "Kamlesh");

		//serialize to file
		try {
			serialize(std, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		Student stdNew = null;
		try {
			stdNew = (Student) deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Student Object before Serialization::"+std);
		System.out.println("Student Object after Deserialization::"+stdNew);
	}

	// Deserialize Object
	public static Object deserialize(String fileName) throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}

	// Serialize Object
	public static void serialize(Object obj, String fileName)
			throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
	}
}
