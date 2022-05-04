package javaAPI;

public class Key {
	public int number; //다른 패키기에서 이용시 public 이용
	
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey=(Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	}
}
