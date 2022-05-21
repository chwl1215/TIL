package javaThread1;

public class AutoSaveThread extends Thread{
	//메소드
	public void save() {
		System.out.println("작업내용이 저장됨.");
	}
	//메소드 오버라이드
	@Override
	public void run() {
		while(true) {
			System.out.println("문서작업중...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			save();
		}
	}
}
