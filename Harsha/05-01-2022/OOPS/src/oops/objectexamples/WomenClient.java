package oops.objectexamples;

import oops.classexamples.Women;

public class WomenClient {

	public static void main(String[] args) {
		
		Women w = new Women();
		System.out.println(w.name+" "+w.age+" "+w.height+" "+w.weight+" "+w.color);
		w.name = "Harsha";
		w.age = 30;
		w.height = 5.6f;
		w.weight = 60.0f;
		w.color = "Brown";
		System.out.println(w.name+" "+w.age+" "+w.height+" "+w.weight+" "+w.color);
	System.out.println(w.hashCode());
	
	Women w2 = new Women();
	System.out.println(w2.name+" "+w2.age+" "+w2.height+" "+w2.weight+" "+w2.color);
	w2.name = "Kruthika";
	w2.age = 28;
	w2.height = 5.10f;
	w2.weight = 70.0f;
	w2.color = "Brown";
	System.out.println(w2.name+" "+w2.age+" "+w2.height+" "+w2.weight+" "+w2.color);
System.out.println(w2.hashCode());

	}

}
