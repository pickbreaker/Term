/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 08.03.2015
  * @author 
  */

public class Adapter {
  
  // Anfang Attribute
  private Object[] Data;
  // Ende Attribute
  
  public Adapter(int count) {
    this.Data = null;
  }

  // Anfang Methoden
  public Object[] getData() {
    return Data;
  }

  public void setData(Object[] Data) {
    this.Data = Data;
  }

  // Ende Methoden
} // end of Adapter
