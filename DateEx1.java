package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date=new Date(); // ���糯¥
		System.out.println(date);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy�� MM�� dd�� (hh�� mm�� ss��)");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy�� MM�� dd�� (E����)"); //E:����
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy�� D��"); // 1���� ���� ���� ��
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy�� MM�� dd�� (HH�� mm�� ss��)"); //HH:24�ð� ����
		SimpleDateFormat sdf5=new SimpleDateFormat("yyyy�� MM�� dd�� (a hh�� mm�� ss��(S))"); //a:���� ����, S:1000���� 1�� ����
		SimpleDateFormat sdf6=new SimpleDateFormat("yyyy�� MM�� dd��-w���� (a hh�� mm�� ss��(S))"); //w:�� ��
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		System.out.println(sdf5.format(date));
		System.out.println(sdf6.format(date));
		
	}

}