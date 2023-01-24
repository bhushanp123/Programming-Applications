package Assignemt_21jan;

public class Q2_ProveImmutable {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println(s1.hashCode());
		
		s1 = s1.concat(s2);
		System.out.println(s1.hashCode());
	}

}
