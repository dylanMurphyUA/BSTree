
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
	public void insert(String s){
		if(root!=null){
            insert(root, s);
        }
		else{
			root = new TNode(s);
		}
	}
	private void insert(TNode t, String s){
		if(s.compareTo(t.getData()) < 0){
			if(t.left != null){
				insert(t.left, s);
			}
			else{
				t.left = new TNode(s);
			}
		}else  if(s.compareTo(t.getData()) > 0){
			if(t.right != null){
				insert(t.right, s);
			}
			else{
				t.right = new TNode(s);
			}
		}
	}
	
	
}
