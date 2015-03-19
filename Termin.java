/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.02.2015
  * @author 
  */

public class Termin {
  
  // Anfang Attribute
  private int startTime;
  private boolean privat;
  private String title;
  private String desc;
  private String place;
  // Ende Attribute
  
  public Termin(int start, boolean priv, String head, String description, String plc) {
    this.startTime = start;
    this.privat = priv;
    this.title = head;
    this.desc = description;
    this.place = plc;
  }

  // Anfang Methoden
  public int getStartTime() {
    return startTime;
  }

  public boolean getPrivat() {
    return privat;
  }

  public String getTitle() {
    return title;
  }

  public String getDesc() {
    return desc;
  }

  public String getPlace() {
    return place;
  }

  // Ende Methoden
} // end of Termin
