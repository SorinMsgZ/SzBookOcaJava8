package _c_chapter3._c_java_arrays;

public class CastingArray {

	public static void main(String[] args) {
		 String[] strings = { "stringValue" };
		 Object[] objects = strings;
		 String[] againStrings = (String[]) objects;
		 //againStrings[0] = new StringBuilder();      // DOES NOT COMPILE (a String is expected!)
		 objects[0] = new StringBuilder();               // careful! ==> throws an exception (a String is expected!)

	}

}
