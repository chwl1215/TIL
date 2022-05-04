package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {
		String ssn="921023-136974";
		String newssn=ssn.substring(0,8) + "******";
		System.out.println(newssn);
		String original="Java Programmming";
		String lower=original.toLowerCase();
		String upper=original.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);

	}

}
