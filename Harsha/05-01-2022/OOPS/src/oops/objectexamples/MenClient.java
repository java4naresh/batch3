package oops.objectexamples;

import oops.classexamples.Mens;

public class MenClient {

	public static void main(String[] args) {
		
		Mens m = new Mens();
		System.out.println(m.name+" "+m.age+" "+m.height+" "+m.weight+" "+m.color);
		m.name = "Naresh";
		m.age = 30;
		m.height = 5.6f;
		m.weight = 70.0f;
		m.color = "Brown";
		System.out.println(m.name+" "+m.age+" "+m.height+" "+m.weight+" "+m.color);
	System.out.println(m.hashCode());
	
	Mens m2 = new Mens();
	System.out.println(m2.name+" "+m2.age+" "+m2.height+" "+m2.weight+" "+m2.color);
	m2.name = "chandu";
	m2.age = 28;
	m2.height = 5.10f;
	m2.weight = 80.0f;
	m2.color = "Brown";
	System.out.println(m2.name+" "+m2.age+" "+m2.height+" "+m2.weight+" "+m2.color);
System.out.println(m2.hashCode());

	}

}
