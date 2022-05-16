package javaSpecial;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//asList메소드-객체가 고정된 요소를 가질때 사용
		List<String> list1=Arrays.asList("홍길동","김철수","이영희");
		for(String name:list1) {
			System.out.println(name);
		}
		List<Integer> list2=Arrays.asList(10,20,30,40,50);
		for(int value:list2) {
			System.out.println(value);
		}
	}

}
