
public class Trees<T> {

	private static class Node<T> {
		public T value;
		public Node<T> left;
		public Node<T> right;
		
		public Node(T value, Node<T> left, Node<T> right){
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		public Node(T value){
			this(value, null, null);
		}
		
		public void printInOrder(){
			if (this != null){
				this.left.printInOrder();
				System.out.println(this.value);
				this.right.printInOrder();
			}
		}
	}
	
	private Node<T> root;
	
	public Trees() {
		root = null;
	}
	
	public void printInOrder(){
		this.root.printInOrder();
	}
	public static void main(String[] args) {

	}

}
