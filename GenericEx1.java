package javaSpecial;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		/*int[] nums=new int[5];
		for(int i=0; i<nums.length; i++) {
			nums[i]=(i+1)*10;
			System.out.println(nums[i]);
		}*/
		int[] nums1= {45,96,74,63,20};
		for(int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		int age=nums1[4];
		System.out.println(age);
		List nums=new ArrayList();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.remove(2); //중간 인덱스 삭제 -> 많으면 느려질 수 있음.
		nums.add(2,90); // 중간 추가(인덱스, 값)
		for(int i=0; i<nums.size(); i++) { //size : 자료의 크기
			System.out.println(nums.get(i));
		}
		int abc=(int)nums.get(1);
			System.out.println(abc);
	}

}
	