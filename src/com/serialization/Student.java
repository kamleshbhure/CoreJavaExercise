package com.serialization;

import java.io.Serializable;
import java.lang.Cloneable;

public class Student implements Serializable, Comparable<Student>, Cloneable{
	
	private static final long serialVersionUID = -1L;

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Student{name="+name+",id="+id+"}";
	}

	@Override
	public int compareTo(Student comparestu) {
        return this.name.compareTo(comparestu.getName());
	}

	@Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
}
