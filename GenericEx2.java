package javaSpecial;


import java.util.ArrayList;
import java.util.List;

public class GenericEx2 {

	public static void main(String[] args) {
		List list=new ArrayList(); //�迭���� list
		list.add("ȫ�浿");
		list.add(25.8);
		list.add(96);
		list.add(false);
		list.add(40);
		String str=(String)list.get(0); //���� Ÿ�Ժ�ȯ
		System.out.println(str);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	
}