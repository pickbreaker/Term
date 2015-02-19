import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 05.04.2013
  * @author 
  */

public class main extends Frame implements MouseListener{
  // Anfang Attribute
  public BufferedImage bild;
  int MausX, MausY, MausNeuX, MausNeuY;
  int hoehe, breite;
  private int TAB_BREITE=200;
  private int TAB_HOEHE=20;
  private String JAHR="2015";
  private String MONAT1="März";
  private String MONAT2="April";
  private String MONAT3="Mai";
  private String MONAT4="Juni";
  private Jahr[] Jahre=new Jahr[1];
  private int pointerj=0;
  private int pointerm=8;
  private boolean wait;
  // Ende Attribute
  
  public main(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    addMouseListener (this);
    int frameWidth = 1000; 
    int frameHeight = 800;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    setLayout(null);
    breite = getSize().width;
    hoehe = getSize().height;
    //leeres Pufferbild definieren
    bild = new BufferedImage(d.width,d.height,BufferedImage.TYPE_INT_RGB);
    MausX = 0;
    MausY = 0;
    Jahre[0]= new Jahr(false);
    // Anfang Komponenten
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public main
  public void paint(Graphics g){
    while (wait) { 
      
    } // end of while
    //Puffergrafik laden
    Graphics h = bild.getGraphics();
    //Hintergrund leeren
    h.setColor(Color.white);
    h.fillRect(0,0,this.getWidth()-1,this.getHeight()-1);
    try{
      //externe Grafiken laden
      Image img1 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\GitHub\\Term\\Term\\backx.jpg"));
      Image img2 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\GitHub\\Term\\Term\\next.png"));
      Image img3 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\GitHub\\Term\\Term\\plus.png"));
      Image img4 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\GitHub\\Term\\Term\\previous.png"));
      //System.out.println(img1.toString());
      //System.out.println(img2.toString());
      //System.out.println(img3.toString());
      //System.out.println(img4.toString());
      //Grafik zeichnen
      h.setColor(Color.BLACK);
      h.drawImage(img1,0,10,this.getWidth()-1,this.getHeight()-1,this);
      h.drawImage(img2,250,750,20,20,this);
      h.drawRect(248,748,24,24);
      h.drawImage(img3,200,750,20,20,this);
      h.drawRect(198,748,24,24);
      h.drawImage(img4,150,750,20,20,this);
      h.drawRect(148,748,24,24);
      h.setFont(new Font("Calibri",10,50));
      h.drawString(pointerj+2015+"",450,65);
      h.setFont(new Font("Calibri",10,20));
      if (pointerm>11) {
        h.drawString(Jahre[pointerj+1].Monate[pointerm%12].getName(),185,80);
      }else{
        h.drawString(Jahre[pointerj].Monate[pointerm].getName(),185,80);
      } // end of if
      if (pointerm+1>11) {
        h.drawString(Jahre[pointerj+1].Monate[(pointerm+1)%12].getName(),385,80);
      }else{
        h.drawString(Jahre[pointerj].Monate[pointerm+1].getName(),385,80);
      }// end of if
      if (pointerm+2>11) {
        h.drawString(Jahre[pointerj+1].Monate[(pointerm+2)%12].getName(),585,80); 
      }else{
        h.drawString(Jahre[pointerj].Monate[pointerm+2].getName(),585,80);
      } // end of if
      if (pointerm+3>11) {
        //System.out.println(Jahre[pointerj+1].toString()); 
        h.drawString(Jahre[pointerj+1].Monate[(pointerm+3)%12].getName(),785,80);
      }else{
        h.drawString(Jahre[pointerj].Monate[pointerm+3].getName(),785,80);
      } // end of if
      
    }catch (IOException ex){
      //Ladefehler abfangen
      System.out.println(ex);
    }
    //Tabelle zeichnen
    drawTable(100,100,31,4,h);
    //Puffergrafik auf Fenster übertragen 
    g.drawImage(bild,0,0,null);
    pause (30);
    //neu laden
    repaint();      
  }
  public void update (Graphics g){
    paint(g);
  }
  
  public void pause (int ms){
    try { 
      Thread.sleep(ms);
    } catch(InterruptedException e) {} 
    
  }
  public void drawTable(int x,int y,int countx,int county,Graphics f){
    //Für alle Zeilen
    for (int i=0;i<county;i++) {
      //Für alle Spalten
      for (int j=0;j<countx;j++) {
        //weißes Kästchen mit schwarzem Rahmen
        f.setColor(Color.WHITE);
        f.fillRect(x+(i*TAB_BREITE),y+(j*TAB_HOEHE),TAB_BREITE,TAB_HOEHE);
        f.setColor(Color.BLACK);
        f.drawRect(x+(i*TAB_BREITE),y+(j*TAB_HOEHE),TAB_BREITE,TAB_HOEHE);
      } // end of for
    } // end of for
  }
  // Anfang Methoden
  
  public void mouseClicked(MouseEvent me){
    int posx = me.getX();
    int posy = me.getY();
    //Maus geklickt
    //System.out.println(posx+" x, "+posy+" y.");
    if (posx>248&&posx<272&&posy>748&&posy<772) {
      //auf den next Button geklickt
      //System.out.println("next");
      //paint warten lassen
      wait=true;
      try{
        //übetreten der Jahresgrenze überprüfen
        if (((pointerm+3)-((pointerm+3)%12))/pointerm>Jahre.length-1||!(((pointerm+1)-((pointerm+1)%12))==0)) {
          //System.out.println("1");
          //Jahre um ein weiteres Jahr verlängern
          Jahr[] pivot;
          pivot=Jahre;
          Jahre=new Jahr[Jahre.length+1];
          for (int i=0;i<pivot.length;i++) {
            Jahre[i]=pivot[i];
          } // end of for
          //überprüfen ob neues Jahr ein Schaltjahr ist
          if (Jahre.length-1%400==0){
            Jahre[Jahre.length-1]=new Jahr(true);
          }else if (Jahre.length-1%100==0){
            Jahre[Jahre.length-1]=new Jahr(false);
          }else if (Jahre.length-1%4==0){
            Jahre[Jahre.length-1]=new Jahr(true);
          }else{
            Jahre[Jahre.length-1]=new Jahr(false);
          }// end of if
          //nächten Monat anzeigen
          pointerm++;
        }else{
          //nächsten Monat anzeigen
          pointerm++;
        } // end of if
      }catch (ArithmeticException aex){
        //falls pointerm = 0 also division durch null
        pointerm++;
      }
      //Grafik freigeben
      wait=false;
    }else if(posx>198&&posx<222&&posy>748&&posy<772){
      //auf den plus Button geklickt
      System.out.println("plus");
    }else if(posx>148&&posx<172&&posy>748&&posy<772){
      //auf den previous Button geklickt
      System.out.println("previous");
    }else if(me.getClickCount()>1){
      //Doppelklick
    } // end of if
  } 
  
  
  public void mouseEntered(MouseEvent me)
  { }
  
  public void mouseExited(MouseEvent me)
  { }
  
  public void mousePressed(MouseEvent me){
    
  }
  public void mouseReleased(MouseEvent me)
  { 
    
  }
  // Ende Methoden
  
  public static void main(String[] args) {
    new main("main");
  } // end of main
  
  // end of class ballbuffer
}