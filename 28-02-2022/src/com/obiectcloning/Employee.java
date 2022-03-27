package com.obiectcloning;
//step1: class should implements Cloneable interface
		public class Employee implements Cloneable
		{
			//variables
			String name;
			int id;
			double salary;
			
			//constructor
			public Employee() 
			{
				name = " kavi";
				id = 4204;
				salary =40000.89;
			}
			
			//methods
			public void getEmployeeInfo()
			{
				System.out.println(name);
				System.out.println(id);
				System.out.println(salary);
			}
			
			//main() method
			
			//step2: need to declare with CloneNotSupportedException class
			public static void main(String[] args) throws CloneNotSupportedException
			{
				
				System.out.println("=========by using new keyword and constructor=========");
				
				//step3: need to create original object
				Employee e1 = new Employee();
				e1.getEmployeeInfo();
				
				System.out.println("=========by using clone() method=========");
				
				//step4: need to call clone() method and type cast to original object
				Employee e2 = (Employee)e1.clone();
				e2.getEmployeeInfo();
				
			}

	}






	


