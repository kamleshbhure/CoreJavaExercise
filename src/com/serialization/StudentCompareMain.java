package com.serialization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCompareMain {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(110,"Kamlesh"));
		studentList.add(new Student(120, "Parag"));
		studentList.add(new Student(100, "Siddharth"));
        studentList.add(new Student(125, "Jijo"));

        System.out.println("Ordering");
        Collections.sort(studentList);
        studentList.stream().map(s -> s.getName()).forEach(System.out::println);

        // Sorted by Name
        Collections.sort(studentList, new StudentNameComparator());
        System.out.println(studentList);

        // Sorted by Id
        Collections.sort(studentList, new StudentIdComparator());
        System.out.println(studentList);
	}

}
