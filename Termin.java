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
  private int endTime;
  private boolean privat;
  private String title;
  private String desc;
  private String place;
  // Ende Attribute
  
  public Termin(int start, int end, boolean priv, String head, String description, String plc) {
    this.startTime = 0;
    this.endTime = 0;
    this.privat = false;
    this.title = "";
    this.desc = "";
    this.place = "";
  }

  // Anfang Methoden
  public int getStartTime() {
    return startTime;
  }

  public int getEndTime() {
    return endTime;
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
