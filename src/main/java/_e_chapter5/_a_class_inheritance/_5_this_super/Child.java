package _e_chapter5._a_class_inheritance._5_this_super;

public class Child extends _e_chapter5._a_class_inheritance._5_this_super.Parent {

	Child() {

	}

	Child(int var1) {
		this(); //SZ using this() - default constructor
	}

	void someChildMethod() {
		super.var1 = 1;
	}

	public Child metoda() {
		return this;  //SZ using this -> regarding the instance; the return type has to be the same type like the class?! 
	}

	public static void main(String[] args) {

		Child testChild = new Child();
		testChild.someChildMethod();
		System.out.println(testChild.var1);

		System.out.println(testChild.toString());
		System.out.println(testChild.metoda().toString());
		System.out.println(testChild == testChild.metoda());

	}
}
