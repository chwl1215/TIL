package javaAPI;

public class StringEx2 {

	public static void main(String[] args) {
		String str="korea";
		byte[] blen=str.getBytes();
		System.out.println(blen.length);
		String str2="æ»≥Á«œººø‰";
		byte[] blen2=str2.getBytes();
		System.out.println(blen2.length);

	}

}
