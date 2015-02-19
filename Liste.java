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
  
  public void addNode(Termin term,Node myNode,int zähl) {
    //Objekt hinzufügen
    if(count==0){
      //Spezialfall: Es besteht noch kein Termin
      firstNode=new Node(term,myNode.getNextNode());
      myNode.setNextNode(firstNode);
    }else if(!(zähl==count)) {
      //Ans Ende gehen
      addNode(term,myNode.getNextNode(),zähl+1);
    }else{
      //Termin am Ende hinzufügen
      myNode.setNextNode(new Node(term,myNode.getNextNode()));
      count++; 
    } // end of if
  }
  
  public Node getNodeAt(int pos,Node myNode){
    for (int k=0;k<pos;k++) {
      //Objekt an Position zurückgeben
      myNode=myNode.getNextNode(); 
    } // end of for
    return myNode;
  }
  
  public void deleteNode(int pos,int zähl,Node myNode) {
    if (zähl==pos-1) {
      //Objekt an Position entfernen
      myNode.setNextNode(myNode.getNextNode().getNextNode());
      count--; 
    }else{
      //Bis Löschposition gehen
      deleteNode(pos,zähl+1,myNode.getNextNode());
    } // end of if
  }
  
  public void addListe(Liste list){
    //alle Termine einer Liste hinzufügen
    for (int j=0;j<list.count;j++) {
      //Für jedes Objekt in Liste
      Node t;
      //Objekt zurückgeben
      t=list.getNodeAt(j,list.getFirstNode());
      //Objekt in bestehende Liste einfügen
      this.addNode(t.getContent(),this.getNodeAt(count-1,firstNode),0);
    } // end of for
  }
  // Ende Methoden
} // end of Liste
