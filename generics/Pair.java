package generics;

public class Pair<KEY, VAL> {
	
	private KEY key;
	private VAL val;
	
	
	
	public Pair(KEY key, VAL val) {
		this.key = key;
		this.val = val;
	}
	public KEY getKey() {
		return key;
	}
	public void setKey(KEY key) {
		this.key = key;
	}
	public VAL getVal() {
		return val;
	}
	public void setVal(VAL val) {
		this.val = val;
	}
	

	 
}
