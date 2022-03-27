package com.obiectcloning;


		//step1: class should implements Cloneable interface
		public class Student implements Cloneable
		{
			//variables
			int rollNo;
			String name;
			
			//constructor
			public Student() 
			{
				rollNo = 07;
				name = "Bhavani";
			}
			
			//methods
			public void getStudentInfo()
			{
				System.out.println(rollNo);
				System.out.println(name);
			}
			
			//main() method
			
			//step2: need to declare with CloneNotSupportedException class
			public static void main(String[] args) throws CloneNotSupportedException
			{
				
				System.out.println("=========by using new keyword and constructor=========");
				
				//step3: need to create original object
				Student student = new Student();
				student.getStudentInfo();
				
				System.out.println("=========by using clone() method=========");
				
				//step4: need to call clone() method and type cast to original object
				Student student2 = (Student)student.clone();
				
				student2.getStudentInfo();
				
			}

	}


