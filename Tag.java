/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Tag {
  
  // Anfang Attribute
  private Liste Termine;
  // Ende Attribute
  
  // Anfang Methoden
  public Liste getTermine() {
    return Termine;
  }

  public void addTermin(Termin term) {
    Termine.addNode(term,Termine.getFirstNode(),0);
  }

  public Tag() {
    this.Termine = null;
  }

  public void removeTermin(int count) {
    Termine.deleteNode(count,0,Termine.getFirstNode()); 
  }

  // Ende Methoden
} // end of Tag
