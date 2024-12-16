package com.ap.encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1=new Employee(101,"NEHA");
		
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());

		employee1.setName("Priya singh");
		System.out.println(employee1.getName());
}
}