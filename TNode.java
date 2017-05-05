
public class TNode {
	TNode left, right;
    String data;
    int frequency;
    
    public TNode(){
    		left = null;
        right = null;
        data = null;
    }
    public TNode(String s){
    		left = null;
        right = null;
        data = s;
    }
    public TNode getLeft(){
    	return left;
    }
    
    public TNode getRight(){
    	return right;
    }
    
    public void setLeft(TNode t)
    {
        left = t;
    }

    public void setRight(TNode t)
    {
        right = t;
    }

    public void setData(String d)
    {
        data = d;
    }

    public String getData()
    {
        return data;
    }
    public void addFreq(){
    	frequency++;
    }
}
