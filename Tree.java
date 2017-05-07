import java.util.ArrayList;
public class Tree {
	private TNode root;
	ArrayList<String> list = new ArrayList<String>();
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
		if(s.compareToIgnoreCase(t.getData()) < 0){
			if(t.left != null){
				insert(t.left, s);
			}
			else{
				TNode newNode = new TNode(s);
				t.left = newNode;
				newNode.setParent(t);
			}
		}else  if(s.compareToIgnoreCase(t.getData()) > 0){
			if(t.right != null){
				insert(t.right, s);
			}
			else{
				TNode newNode = new TNode(s);
				t.right = newNode;
				newNode.setParent(t);
			}
		}else{
			t.addFreq();
		}
	}
	public void inorder()
    {
         inorder(root);
    }
    
    private void inorder(TNode r)
     {
         if (r != null)
         {
             inorder(r.getLeft());
             System.out.println(r.getData() +" "+r.getFreq());
             list.add(r.getData());
             inorder(r.getRight());
         }
     }
	
	
}
