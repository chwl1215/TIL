package javabase;

public class Question133_5 {

	public static void main(String[] args) {
			int sum=0;
			int x;
			int y;
			for(x=1; x<=10; x++ ) {
				for(y=1; y<=10; y++ ) {
					sum=4*x+5*y;
					if(sum == 60) {
						System.out.println("(" + x + ", " + y +")");
				}
			}

	}
	}
}
