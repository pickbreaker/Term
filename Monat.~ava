/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Monat { 
  // Anfang Attribute
  protected Tag[] Tage;
  private int zahl;
  private String name;
  // Ende Attribute
  
  public Monat(int count) {
    this.Tage = new Tag[count];
    for (int i=0;i<count;i++) {
      Tage[i]=new Tag();
    } // end of for
    this.zahl=count;
  }
  
  // Anfang Methoden
  public Liste getTermine() {
    //Termine eines Monats abrufen
    //leere Liste generieren
    Liste list=new Liste();
    for (int i=0;i<Tage.length;i++) {
      //für alle Tage Termine zur Liste hinzufügen
      list.addListe(Tage[i].getTermine()); 
    } // end of for
    return list;
  }
  public void setName(String title){
    //Monatsname setzen
    this.name=title;
    }
    public String getName(){
    //Monatsname zurückgeben
     return name;
    }
     public int duration(){
      return zahl;
     }
    public void addTermin(Termin term,int day){
      Tage[day-1].addTermin(term);
    }
  
  // Ende Methoden
} // end of Monat
