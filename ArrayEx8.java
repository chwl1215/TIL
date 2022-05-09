package javaObject;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] nums= {10,20,30};
		int[] copyNums=new int[5]; //복사 위치 
		for(int i=0; i<nums.length; i++) { //개인이 만들어야하는 밥솥
			copyNums[i]=nums[i];//배열복사
		}
		nums[0]=70;
		//자료 출력
		for(int i=0; i<copyNums.length; i++) {
			System.out.print(copyNums[i] + "  ");
		}
	}

}
