package javaSpecial;

public class Student {
	//�ʵ�
	private String name;
	private int korScore;
	private int engScore;
	private int matScore;
	//������
	public Student(String name, int  korScore, int engScore, int matScore) {
		this.name=name;
		this.korScore=korScore;
		this.engScore=engScore;
		this.matScore=matScore;
	}
	public String getName() {
		return name;
	}
	public int getKorScore() {
		return korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMatScore() {
		return matScore;
	}
}
