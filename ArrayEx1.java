package javaObject;

public class ArrayEx1 {

	public static void main(String[] args) {
		//int[] score= {80,70,60,88,96};
		int[] score=new int[5];
		score[0]=70;
		score[1]=80;
		score[2]=96;
		score[3]=65;
		score[4]=90;
		
		int total=0;
		for(int i=0; i<=4; i++) {
			total+=score[i];
			
		}
		System.out.println("���� = " + total);
		System.out.println("��� = " + total/5);
	}

}
