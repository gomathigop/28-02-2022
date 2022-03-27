package com.obiectcloning;
 
	public class Gomathi implements Cloneable
	{
		
		String name;
		int age;
		String qualification;
		
		
		public Gomathi() 
		{

			name = "Gomathi";
			age = 21;
			qualification="B.E";
			
		}
		
		public void getDetails()
		{
			System.out.println(name);
			System.out.println(age);
			System.out.println(qualification);
		}
		
		//step2
		public static void main(String[] args) throws CloneNotSupportedException
		{
			//step3
			Gomathi s1 = new Gomathi();
			s1.getDetails();
			
			System.out.println("================");
			
			//step4
			Gomathi s2 = (Gomathi) s1.clone();
			s2.getDetails();
			
		}

	}



	


