package javaObject;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] nums= {10,20,30};
		int[] copyNums=new int[5]; //���� ��ġ 
		for(int i=0; i<nums.length; i++) { //������ �������ϴ� ���
			copyNums[i]=nums[i];//�迭����
		}
		nums[0]=70;
		//�ڷ� ���
		for(int i=0; i<copyNums.length; i++) {
			System.out.print(copyNums[i] + "  ");
		}
	}

}
