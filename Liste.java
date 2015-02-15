/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Liste {
  
  // Anfang Attribute
  private Node firstNode;
  private int count;
  // Ende Attribute
  
  public Liste() {
    this.firstNode = new Node(null,null);
    this.count = 0;
  }
  
  // Anfang Methoden
  public Node getFirstNode() {
    return firstNode;
  }
  
  public int getCount() {
    return count;
  }
  
  public void addNode(Termin term,Node myNode,int z�hl) {
    if(count==0){
      firstNode=new Node(term,myNode.getNextNode());
      myNode.setNextNode(firstNode);
    }else if(!(z�hl==count)) {
      addNode(term,myNode.getNextNode(),z�hl+1);
    }else{
      myNode.setNextNode(new Node(term,myNode.getNextNode()));
      count++; 
    } // end of if
  }
  
  public Node getNodeAt(int pos,Node myNode){
    for (int k=0;k<pos;k++) {
      myNode=myNode.getNextNode(); 
    } // end of for
    return myNode;
  }
  
  public void deleteNode(int pos,int z�hl,Node myNode) {
    if (z�hl==pos-1) {
      myNode.setNextNode(myNode.getNextNode().getNextNode()); 
    }else{
      deleteNode(pos,z�hl+1,myNode.getNextNode());
      count--;
    } // end of if
  }
  
  public void addListe(Liste list){
    for (int j=0;j<list.count;j++) {
      Node t;
      t=list.getNodeAt(j,list.getFirstNode());
      this.addNode(t.getContent,this.getNodeAt(count-1,firstNode),0);
    } // end of for
  }
  // Ende Methoden
} // end of Liste
