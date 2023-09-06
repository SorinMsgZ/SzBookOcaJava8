package _c_chapter3._b_equality;

public class StringEqualitySameCompileValues1Variable {

public static void main(String[] args) {
	System.out.println('\n'+ "Test3a - without concatenation");
	String d1 = "efg";
	String d2 = "efg";
	System.out.println(d1 == d2); // true
	System.out.println(d1.equals(d2)); // true
	
	System.out.println('\n'+ "Test3b - using compound assignment");
	String h1 = "efg";
	String h2 = "efg";
	h1 += "";
	h1 += "";
	h1 += "";
	System.out.println(h1 == h2); // false!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	System.out.println(h1.equals(h2)); // true
	h1 = "efg"+"";
	System.out.println(h1 == h2); //true
	
	

	System.out.println('\n' + "Test3c - using trim() method:");
	String j1 = "efg";
	String j2 = "efg";
	j1 = j1.trim(); //using trim() method
	System.out.println(j1 == j2); // true
	System.out.println(j1.equals(j2)); // true
	
	System.out.println('\n' + "Test3d -concat. an empty String using concat() method:");
	String t1 = "efg";
	String t2 = "efg";
	t1= t1.concat(""); // concat. an empty String using concat() method
	System.out.println(t1 == t2); // true
	System.out.println(t1.equals(t2)); // true
	
	System.out.println('\n' + "Test3e -concat. an empty String to a String using + operator:");
	String r1 = "efg";
	String r2 = "efg";
	r1 =r1 + ""; // concat. an empty String to a String using + operator
	System.out.println(r1 == r2); // false!!!
	System.out.println(r1.equals(r2)); // true

	System.out.println('\n' + "Test3f -concat. an empty String to a literal using + operator:");
	String m1 = "efg";
	String m2 = "efg";
	m1 ="efg" + ""; // concat. an empty String to a literal using + operator
	System.out.println(m1 == m2); // true!!!!!
	System.out.println(m1.equals(m2)); // true
}
	
}
