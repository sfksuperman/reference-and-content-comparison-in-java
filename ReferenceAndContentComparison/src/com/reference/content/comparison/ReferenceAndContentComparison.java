package com.reference.content.comparison;

public class ReferenceAndContentComparison {

	public static void main(String[] args) {

		/* "==" operator is used for REFERENCE (or address) comparison. It means, it check if both objects point to same memory location or not.
		 * ".equals()" method is used for CONTENT comparison (in String class). It means, it check if both objects have same value or not.
		 * 
		 * MAIN DIFFERENCES ARE:
		 * 1. "==" is an operator while ".equals()" is a method (of Object class).
		 * 2. Line 7 to 8.
		 * 3. ".equals()" method of Object class is used for REFERENCE comparison but in String class, it is used for CONTENT reference (by overriding .equals()).
		 * 4. If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent class that has overridden this method.
		 * 5. When comparing two Strings using .equals() method, their content is compared, and not their references.
		 *    Link for point 5: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equals-java.lang.Object-
		 */
		String s1 = "HELLO";
        String s2 = "HELLO"; // references s1
        String s3 =  new String("HELLO"); // new instance but same content
 
        System.out.println(s1 == s2); // true; Both s1 and s2 refer to same objects. Their addresses are same.
        System.out.println(s1 == s3); // false; Addresses of s1 and s3 are different.
        System.out.println(s1.equals(s2)); // true; Content of both s1 and s2 are same. Content Reference, because s1 and s2 are string class objects.
        System.out.println(s1.equals(s3)); // true; Content of both s1 and s3 are same. Content Reference, because s1 and s3 are string class objects.
		
        System.out.println("-----");
        
		Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        String st1 = new String("WORLD");
        String st2 = new String("WORLD");
 
        System.out.println(t1 == t3); // true; Both t1 and t3 refer to same objects. Address of t1 is assigned to t3.
        System.out.println(t1 == t2); //false; Addresses of t1 and t2 are different.
        System.out.println(st1 == st2); // false; Addresses of st1 and st2 are different.
        System.out.println(t1.equals(t2)); /* false; Here, t1 and t2 are both Thread class objects (not String class objects) and we haven't overridden the
        									.equals() method for Thread class anywhere so by default (as per point 4), .equals() of Object class will be
        									in effect and hence as per point 3, .equals() will be used as REFERNCE Comparison.
        									And since addresses are different, it's false.*/
        System.out.println(st1.equals(st2)); /* true; Unlike above scenario, st1 and st2 are String class objects and hence as per point 5, content reference is
         										happening here and since their contents are same, it is true.*/

	}

}
