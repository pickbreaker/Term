/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Monat {
  
  // Anfang Attribute
  private Tag[] Tage;
  private int zahl;
  // Ende Attribute
  
  public Monat(int zahl) {
    this.Tage = new Tag[zahl];
  }
  
  // Anfang Methoden
  public Liste getTermine() {
    Liste list=new Liste();
    for (int i=0;i<Tage.length;i++) {
      list.addListe(Tage[i].getTermine()); 
    } // end of for
    return list;
  }
  
  // Ende Methoden
} // end of Monat
