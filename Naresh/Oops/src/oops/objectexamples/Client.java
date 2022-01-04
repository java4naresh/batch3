package oops.objectexamples;

import oops.classexamples.Humans;

public class Client {

	public static void main(String[] args) {

		Humans h = new Humans();
		System.out.println(h.name+" "+h.age+" "+h.gender);
		h.name = "Naresh";
		h.age = 30;
		h.gender = 'M';
		System.out.println(h.name+" "+h.age+" "+h.gender);
		Humans h2 = new Humans();
		System.out.println(h2.name+" "+h2.age+" "+h2.gender);
		h2.name = "Harsha";
		h2.age = 26;
		h2.gender = 'F';
		System.out.println(h2.name+" "+h2.age+" "+h2.gender);
	}

}
