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
    bild = new BufferedImage(d.width,d.height,BufferedImage.TYPE_INT_RGB);
    MausX = 0;
    MausY = 0;
    // Anfang Komponenten
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public main
  public void paint(Graphics g){
    Graphics h = bild.getGraphics();
    h.setColor(Color.white);
    h.fillRect(0,0,this.getWidth()-1,this.getHeight()-1);
    try{
      Image img1 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\Java\\Projects\\Term\\backx.jpg"));
      Image img2 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\Java\\Projects\\Term\\next.png"));
      Image img3 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\Java\\Projects\\Term\\plus.png"));
      Image img4 = ImageIO.read(new File("C:\\Users\\Benedikt\\Documents\\Java\\Projects\\Term\\previous.png"));
      //System.out.println(img1.toString());
      //System.out.println(img2.toString());
      //System.out.println(img3.toString());
      //System.out.println(img4.toString());
      h.setColor(Color.BLACK);
      h.drawImage(img1,0,10,this.getWidth()-1,this.getHeight()-1,this);
      h.drawImage(img2,250,750,20,20,this);
      h.drawRect(248,748,24,24);
      h.drawImage(img3,200,750,20,20,this);
      h.drawRect(198,748,24,24);
      h.drawImage(img4,150,750,20,20,this);
      h.drawRect(148,748,24,24);
    }catch (IOException ex){
      System.out.println(ex);
    }
    drawTable(100,100,31,4,h); 
    g.drawImage(bild,0,0,null);
    pause (30);
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
    for (int i=0;i<county;i++) {
      for (int j=0;j<countx;j++) {
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
    System.out.println(posx+" x, "+posy+" y.");
    if (posx>248&&posx<272&&posy>748&&posy<772) {
      System.out.println("next");
    }else if(posx>198&&posx<222&&posy>748&&posy<772){
      System.out.println("plus");
    }else if(posx>148&&posx<172&&posy>748&&posy<772){
      System.out.println("previous");
    }else if(me.getClickCount()>1){
      
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