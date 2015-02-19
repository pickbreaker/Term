/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Jahr {
  
  // Anfang Attribute
  protected Monat[] Monate;
  private int zahl;
  private boolean schaltjahr;
  // Ende Attribute
  
  public Jahr(boolean schalt) {
    //alle 12 Monate intialisieren
    this.schaltjahr = schalt;
    this.Monate = new Monat[12];
    Monate[0]= new Monat(31);
    if (schaltjahr) {
      Monate[1]= new Monat(29);  
    }else{ 
      Monate[1]=new Monat(28);
    }// end of if
    Monate[2]=new Monat(31);
    Monate[3]=new Monat(30);
    Monate[4]=new Monat(31);
    Monate[5]=new Monat(30);
    Monate[6]=new Monat(31);
    Monate[7]=new Monat(31);
    Monate[8]=new Monat(30);
    Monate[9]=new Monat(31);
    Monate[10]=new Monat(30);
    Monate[11]=new Monat(31);
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
  public String toString(){
     return Monate[1].getName();
    }
  // Ende Methoden
} // end of Jahr
