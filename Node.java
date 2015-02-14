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
  
  public Node(Termin term) {
    this.content = null;
    this.nextNode = null;
  }

  // Anfang Methoden
  public Termin getContent() {
    return content;
  }

  public Node getNextNode() {
    return nextNode;
  }

  // Ende Methoden
} // end of Node
