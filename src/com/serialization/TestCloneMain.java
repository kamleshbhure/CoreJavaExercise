package com.serialization;

public class TestCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std = new Student(110,"Kamlesh");
		Student stdNew = (Student) std.clone();
		System.out.println(std);
		System.out.println(stdNew);
		
		try {
			Class cls = Class.forName("TestCloneMain");
			System.out.println("Class - "+cls.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
