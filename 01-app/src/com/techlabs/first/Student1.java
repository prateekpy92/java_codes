package com.techlabs.first;

import com.techlabs.input.Status;

public class Student1 {
	class Student {
	    private int rollNumber;
	    private String name;
	    private int age;
	    private String emailId;
	    private Status status;

	 

	    public Student(int rollNumber, String name, int age, String emailId,Status status) {
			super();
			this.rollNumber = rollNumber;
			this.name = name;
			this.age = age;
			this.emailId = emailId;
			this.status = status;
		}

		
	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getEmailId() {
	        return emailId;
	    }
	    public Status getStatus() {
	        return status;
	    }
	    
	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }
	    public void setStatus(Status status) {
	        this.status = status;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +"rollNumber=" + rollNumber +", name='" + name + '\'' +", age=" + age +", emailId='" + emailId + '\'' +
	        		", status=" + status +  '}';
	    }
	}
}
