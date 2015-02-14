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
  private Node currentNode;
  private int count;
  // Ende Attribute
  
  public Liste() {
    this.firstNode = null;
    this.currentNode = null;
    this.count = 0;
  }

  // Anfang Methoden
  public Node getFirstNode() {
    return firstNode;
  }

  public Node getCurrentNode() {
    return currentNode;
  }

  public int getCount() {
    return count;
  }

  public void addNode(Termin term) {
    
  }

  public void deleteNode(int count) {
    
  }

  // Ende Methoden
} // end of Liste
