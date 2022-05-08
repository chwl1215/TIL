package javaObject;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] scores= {86,70,96,60,78,85,88,92,72,83,56};
			int count=0;
			for(int i=0; i<scores.length; i++) {
				if(scores[i]>=80) {
					count++;
				}			

			}
			System.out.println("총 합격자 수 = " + count + "명");
		}
			
}
