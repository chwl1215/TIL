package javaThread1;

public class AutoSaveThread extends Thread{
	//�޼ҵ�
	public void save() {
		System.out.println("�۾������� �����.");
	}
	//�޼ҵ� �������̵�
	@Override
	public void run() {
		while(true) {
			System.out.println("�����۾���...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			save();
		}
	}
}
