package java8prog;

public class StringPoolDemo {
	
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String(s2);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		
		
	}

}
