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
    // Anfang Komponenten
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public main
  public void paint(Graphics g){
    //Puffergrafik laden
    Graphics h = bild.getGraphics();
    //Hintergrund leeren
    h.setColor(Color.white);
    h.fillRect(0,0,this.getWidth()-1,this.getHeight()-1);
    try{
      //externe Grafiken laden
      Image img1 = ImageIO.read(new File("C:\\Dokumente und Einstellungen\\THG\\Eigene Dateien\\Downloads\\Term-master\\Term-master\\backx.jpg"));
      Image img2 = ImageIO.read(new File("C:\\Dokumente und Einstellungen\\THG\\Eigene Dateien\\Downloads\\Term-master\\Term-master\\next.png"));
      Image img3 = ImageIO.read(new File("C:\\Dokumente und Einstellungen\\THG\\Eigene Dateien\\Downloads\\Term-master\\Term-master\\plus.png"));
      Image img4 = ImageIO.read(new File("C:\\Dokumente und Einstellungen\\THG\\Eigene Dateien\\Downloads\\Term-master\\Term-master\\previous.png"));
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
      h.drawString(JAHR,450,65);
      h.setFont(new Font("Calibri",10,20));
      h.drawString(MONAT1,185,80);
      h.drawString(MONAT2,385,80);
      h.drawString(MONAT3,585,80);
      h.drawString(MONAT4,785,80);
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
      System.out.println("next");
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