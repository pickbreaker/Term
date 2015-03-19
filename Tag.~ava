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
    //Termine als Liste abfragen
    return Termine;
  }

  public void addTermin(Termin term) {
    //Termin für diesen Taghinzufügen
    Termine.addNode(term,Termine.getFirstNode(),0);
  }

  public Tag() {
    this.Termine = new Liste();
  }

  public void removeTermin(int count) {
    //Bestimmten Termin aus Liste entfernen
    Termine.deleteNode(count,0,Termine.getFirstNode()); 
  }

  // Ende Methoden
} // end of Tag
