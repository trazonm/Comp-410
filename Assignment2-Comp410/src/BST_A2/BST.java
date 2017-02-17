package BST_A2;

public class BST implements BST_Interface {
  public BST_Node root;
  int size;
  
  public BST(){ size=0; root=null; }
  
  @Override
  //used for testing, please leave as is
  public BST_Node getRoot(){ return root; }

@Override
public boolean insert(String s) {
	
	
	if(this.contains(s)){
	return false;
	}
	
	else{
		BST_Node node=new BST_Node(s);
		if(size==0){
			root=node;
			size++;
			return true;
		}
		
		else{
			size++;
			return root.insertNode(node);
			
		}
	}
	
}

@Override
public boolean remove(String s) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String findMin() {

	if(size==0){
	return null;
	}
	
	return root.findMin().data;
	
}

@Override
public String findMax() {
	if (size==0){
	return null;
	}
	return root.findMax().data;
}

@Override
public boolean empty() {
	
	
	return (size==0);
		
	
}

@Override
public boolean contains(String s) {
	
	if(size==0){
		return false;
	}
	
	else{
		
		return root.containsNode(s);
	}
	
}

@Override
public int size() {
	
	return size;
}

@Override
public int height() {
	
	return root.getHeight();
}

}
