
public class Tree {
	private TNode root;
	
	public Tree(){
		root=null;
	}
	public boolean isEmpty(){
		return root == null;
	}
	public void setRoot(String data){
		root = new TNode(data);
	}
	public TNode getRoot(){
		return root;
	}
	
}
