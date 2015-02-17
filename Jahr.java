/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Jahr {
  
  // Anfang Attribute
  private Monat[] Monate;
  private int zahl;
  private boolean schaltjahr;
  // Ende Attribute
  
  public Jahr() {
    //alle 12 Monate intialisieren
    this.Monate = new Monat[11];
    Monate[0].setName("Januar");
    Monate[1].setName("Februar");
    Monate[2].setName("März");
    Monate[3].setName("April");
    Monate[4].setName("Mai");
    Monate[5].setName("Juni");
    Monate[6].setName("Juli");
    Monate[7].setName("August");
    Monate[8].setName("September");
    Monate[9].setName("Oktober");
    Monate[10].setName("November");
    Monate[11].setName("Dezember");
  }

  // Anfang Methoden
  // Ende Methoden
} // end of Jahr
