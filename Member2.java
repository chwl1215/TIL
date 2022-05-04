package javaAPI;

import java.util.Arrays;

public class Member2 implements Cloneable{
	//�ʵ�
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	//������
	public Member2(String name, int age, int[] scores, Car car) {
		this.name=name;
		this.age=age;
		this.scores=scores;
		this.car=car;
	}
	//�޼ҵ�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member2 cloned =(Member2) super.clone(); //name, age ���� ����
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length); //�迭
		cloned.car=new Car(this.car.model); //��ü
		return cloned;
	}
	public Member2 getMember() {
		Member2 cloned=null;
		try { 
			cloned=(Member2) clone();
		}catch(CloneNotSupportedException e) {
		
		}
		return cloned;
	}
}
