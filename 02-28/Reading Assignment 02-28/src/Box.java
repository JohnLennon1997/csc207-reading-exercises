
public class Box<T> {

	private T value;
	
	public Box(T value){
		this.value = value;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T value){
		this.value = value;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
