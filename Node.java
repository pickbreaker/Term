/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Node {
  
  // Anfang Attribute
  private Termin content;
  private Node nextNode;
  // Ende Attribute
  
  public Node(Termin term,Node next) {
    this.content = term;
    this.nextNode = next;
    if (next==null) {
      this.nextNode=this;
    } // end of if
  }
  
  // Anfang Methoden
  public Termin getContent() {
    return content;
  }
  
  public Node getNextNode() {
    return nextNode;
  }
  
  public void setNextNode(Node next){
    nextNode=next;
  }
  // Ende Methoden
} // end of Node
