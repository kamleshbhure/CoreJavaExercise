package com.serialization;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getId() - s2.getId();
	}

}
