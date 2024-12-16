package com.ap.varibles;

public class StudentDemo1 {

		int id;
		String name;
		String address;
		String fathername;
		String subject;
		int pincode;
		String phoneno;
		
		public StudentDemo1(int id,String name,String address, String fathername,String subject,int pincode,String phoneno) {
		this.id=id;
		this.name=name;
	    this.address=address;
	    this.fathername=fathername;
		this.subject=subject;
		this.pincode=pincode;
		this.phoneno=phoneno;
		}
		public static void main(String[] args) {	
		StudentDemo1 s1=new StudentDemo1(101,"Komal Pathak","Basani","Rajesh kumar","Hindi,English,Math,Science,Computer",221203,"3454564545");
		StudentDemo1 s2=new StudentDemo1(102,"Shivani Mishra","Babatpur","Ramesh Mishra","Hindi,English,Math,Science,Computer",221206,"45352354xx" );
		StudentDemo1 s3=new StudentDemo1(103,"Komal","Shivpur","Sanjay kumar","Hindi,English,Math,Science,Computer",221203,"23456754xx" );
		StudentDemo1 s4=new StudentDemo1(104,"jyoti","Varansi","Sachin","Hindi,English,Math,Science,Computer",221208,"3256233445" );
		StudentDemo1 s5=new StudentDemo1(105,"Neha","Gorakhpur","Aryan","Hindi,English,Math,Science,Computer",221202,"34545655xx" );
		
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.fathername);
		System.out.println(s1.subject);
		System.out.println(s1.pincode);
		System.out.println(s1.phoneno);
		
		System.out.println("     ");
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address);
        System.out.println(s2.fathername);
        System.out.println(s2.subject);
		System.out.println(s2.pincode);
        System.out.println(s2.phoneno);
        
        
           System.out.println("     ");
		
		System.out.println(s3.id+"\n"+s3.name+"\n"+s3.address+"\n"+s3.fathername+"\n"+s3.subject+"\n"+s3.pincode+"\n"+s3.phoneno);
		
	System.out.println("  ");
		
		System.out.println(s4.id+"\n"+s4.name+"\n"+s4.address+"\n"+s4.fathername+"\n"+s4.subject+"\n"+s4.pincode+"\n"+s4.phoneno);
		
		System.out.println("   ");
		
		System.out.println(s5.id+","+s5.name+","+s5.address+","+s5.fathername+"\t"+s5.subject+"\t"+s5.pincode+","+s5.phoneno);
		
		}
		

}
