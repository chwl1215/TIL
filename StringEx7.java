package javaAPI;

public class StringEx7 {

	public static void main(String[] args) {
		String text="홍길동,김철수&박찬호,이영희#박지성";
		String[] names=text.split(",|&|#"); //문자열 여러개 가능
		/*for(String na:names) { //타입 콘솔:
			System.out.println(na);
		}*/
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
