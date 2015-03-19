import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 05.04.2013
  * @author 
  */

public class main extends Frame{
  // Anfang Attribute
  public BufferedImage bild;
  int MausX, MausY, MausNeuX, MausNeuY;
  int hoehe, breite;
  private int TAB_BREITE=200;
  private int TAB_HOEHE=20;
  private Jahr[] Jahre=new Jahr[1];
  private int pointerj=0;
  private int pointerm=0;
  private boolean wait;
  private TextField textField1 = new TextField();
  private Label label1 = new Label();
  private TextField textField2 = new TextField();
  private Label label2 = new Label();
  private TextField numberField1 = new TextField();
  private TextField numberField2 = new TextField();
  private TextField numberField3 = new TextField();
  private Label label3 = new Label();
  private Label label4 = new Label();
  private TextField numberField4 = new TextField();
  private Label label5 = new Label();
  private TextField numberField5 = new TextField();
  private Checkbox checkbox1 = new Checkbox();
  private TextArea textArea1 = new TextArea();
  private Button button1 = new Button();
  private Panel pan;
  private Canvas canv;
  private Boolean FrameActive=false;
  // Ende Attribute
  
  public main(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 1000; 
    int frameHeight = 820;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    breite = getSize().width;
    hoehe = getSize().height;
    //leeres Pufferbild definieren
    bild = new BufferedImage(d.width,d.height,BufferedImage.TYPE_INT_RGB);
    MausX = 0;
    MausY = 0;
    Jahre[0]= new Jahr(false);
    // Anfang Komponenten
    pan=new Panel(null);
    add(pan);
    textField1.setBounds(266, 305, 209, 25);
    textField1.setVisible(false);
    pan.add(textField1);
    label1.setBounds(266, 281, 110, 20);
    label1.setText("Titel");
    label1.setVisible(false);
    pan.add(label1);
    textField2.setBounds(266, 361, 209, 25);
    textField2.setVisible(false);
    pan.add(textField2);
    label2.setBounds(266, 337, 110, 20);
    label2.setText("Ort");
    label2.setVisible(false);
    pan.add(label2);
    numberField1.setVisible(false);
    numberField1.setBounds(522, 305, 33, 25);
    numberField1.setText("");
    pan.add(numberField1);
    numberField2.setVisible(false);
    numberField2.setBounds(570, 305, 33, 25);
    numberField2.setText("");
    pan.add(numberField2);
    numberField3.setBounds(618, 305, 57, 25);
    numberField3.setText("");
    numberField3.setVisible(false);
    pan.add(numberField3);
    label3.setBounds(522, 281, 110, 20);
    label3.setText("Datum");
    label3.setVisible(false);
    pan.add(label3);
    label4.setBounds(522, 337, 110, 20);
    label4.setText("Uhrzeit");
    label4.setVisible(false);
    pan.add(label4);
    numberField4.setBounds(522, 361, 33, 25);
    numberField4.setText("");
    numberField4.setVisible(false);
    pan.add(numberField4);
    label5.setBounds(562, 361, 11, 25);
    label5.setText(":");
    label5.setVisible(false);
    pan.add(label5);
    numberField5.setBounds(578, 361, 33, 25);
    numberField5.setText("");
    numberField5.setVisible(false);
    pan.add(numberField5);
    checkbox1.setBounds(920, 346, 57, 25);
    checkbox1.setLabel("Privat");
    checkbox1.setVisible(false);
    pan.add(checkbox1);
    textArea1.setBounds(266,450,441,100);
    textArea1.setText("");
    textArea1.setVisible(false);
    pan.add(textArea1);
    button1.setBounds(450, 394, 65, 33);
    button1.setLabel("OK");
    button1.setVisible(false);
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    pan.add(button1);
    canv= new Canvas();
    canv.setBounds(0,0,1000,1000);
    canv.setBackground(Color.white);
    pan.add(canv);
    canv.addMouseListener(new MouseListener(){;
      public void mouseClicked(MouseEvent me){
        //System.out.println("maus");
        int posx = me.getX();
        int posy = me.getY();
        System.out.println(posx+":"+posy);
        //Maus geklickt
        //System.out.println(posx+" x, "+posy+" y.");
        if (posx>248&&posx<272&&posy>748&&posy<772) {
          //auf den next Button geklickt
          //System.out.println("next");
          //paint warten lassen
          wait=true;
          //übetreten der Jahresgrenze überprüfen
          //System.out.println(""+pointerm);
          if ((((pointerm+3)-((pointerm+3)%12))/12)+1+pointerj>Jahre.length-1) {
            //System.out.println("1");
            //Jahre um ein weiteres Jahr verlängern
            Jahr[] pivot;
            pivot=Jahre;
            Jahre=new Jahr[pivot.length+1];
            for (int i=0;i<pivot.length;i++) {
              Jahre[i]=pivot[i];
            } // end of for
            //überprüfen ob neues Jahr ein Schaltjahr ist
            if ((Jahre.length+2014)%400==0){
              Jahre[Jahre.length-1]=new Jahr(true);
            }else if ((Jahre.length+2014)%100==0){
              Jahre[Jahre.length-1]=new Jahr(false);
            }else if ((Jahre.length+2014)%4==0){
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
          if (pointerm>11) {
            pointerj++;
            pointerm=0;
          } // end of if
          //Grafik freigeben
          wait=false;
        }else if(posx>198&&posx<222&&posy>748&&posy<772){
          //auf den plus Button geklickt
          FrameActive=true;
          for (int i=0;i<15;i++) {
            pan.getComponent(i).setVisible(true);
          } // end of for
          //System.out.println("plus");
        }else if(posx>148&&posx<172&&posy>748&&posy<772){
          //auf den previous Button geklickt
          //System.out.println("previous");
          //überprüfen ob array vorne verlassen wird
          if (pointerm==0&&pointerj==0) {
            //Fehler-Fenster anzeigen
            JOptionPane.showMessageDialog(null,"Du kannst vergangene Termine nicht mehr ansehen","Fehler",JOptionPane.INFORMATION_MESSAGE); 
          }else{
            if (pointerm==0) {
              pointerj--;
              pointerm=11;
            }else
            //um einen Monat nach vorne springen
            pointerm--;
          } // end of if
        }else if(me.getClickCount()>1){
          //Doppelklick
          findClick(posx,posy);
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
    });
    // Ende Komponenten
    
    setVisible(true);
  } // end of public main
  public void paint(Graphics f){
    f.setColor(Color.YELLOW);
    f.fillRect(0,0,this.getWidth()-1,this.getHeight()-1);
    Graphics g = canv.getGraphics();
    while (wait) { 
      
    } // end of while
    //Puffergrafik laden
    Graphics h = bild.getGraphics();
    //Hintergrund leeren
    h.setColor(Color.white);
    h.fillRect(0,0,this.getWidth()-1,this.getHeight()-1);
    try{
      //externe Grafiken laden
      Image img1 = ImageIO.read(new File("backx.jpg"));
      Image img2 = ImageIO.read(new File("next.png"));
      Image img3 = ImageIO.read(new File("plus.png"));
      Image img4 = ImageIO.read(new File("previous.png"));
      Image img5 = ImageIO.read(new File("Fenster.png"));
      //      System.out.println(img1.toString());
      //      System.out.println(img2.toString());
      //      System.out.println(img3.toString());
      //      System.out.println(img4.toString());
      //      System.out.println(img5.toString());
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
      h.drawString((pointerj+2015)+"",450,65);
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
      } //end of if
      if (pointerm+2>11) {
        h.drawString(Jahre[pointerj+1].Monate[(pointerm+2)%12].getName(),585,80); 
      }else{
        h.drawString(Jahre[pointerj].Monate[pointerm+2].getName(),585,80);
      } // end of if
      if (pointerm+3>11) {
        //        System.out.println(Jahre[pointerj+1].toString()); 
        h.drawString(Jahre[pointerj+1].Monate[(pointerm+3)%12].getName(),785,80);
      }else{
        h.drawString(Jahre[pointerj].Monate[pointerm+3].getName(),785,80);
      } // end of if
      //Tabelle zeichnen
      drawTable(100,100,31,4,h);
      //Tage eintragen
      h.setColor(Color.RED);
      fillTable(h);
      //System.out.println(Jahre.length+"");
      if (FrameActive) {
        h.drawImage(img5,250,250,500,320,this);
      }else{
        for (int i=0;i<15;i++) {
          pan.getComponent(i).setVisible(false);
        } // end of for
      } // end of if
    }catch (IOException ex){
      //Ladefehler abfangen
      System.out.println(ex);
    }
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
      }//  end of for
    } // end of for
  }
  public void fillTable(Graphics f){
    for (int i=0;i<4;i++) {
      //System.out.println(pointerj+", "+pointerm);
      for (int j=0;j<Jahre[pointerj+(((pointerm+i)-((pointerm+i)%12))/12)].Monate[(pointerm+i)%12].duration();j++) {
        f.drawString(""+(j+1),102+i*200,118+j*20);
      } // end of for
    } // end of for
  }
  // Anfang Methoden
  public void button1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    //System.out.println("Button");
    FrameActive=false;
    try{
      receiveData(Integer.parseInt(numberField4.getText()+numberField5.getText()),checkbox1.getState(),textField1.getText(),textArea1.getText(),textField2.getText(),Integer.parseInt(numberField3.getText()),Integer.parseInt(numberField2.getText()),Integer.parseInt(numberField1.getText()));
    }catch(NumberFormatException ex){
      JOptionPane.showMessageDialog(null,"Gib eine Uhrzeit an!","Fehler",JOptionPane.INFORMATION_MESSAGE);
    }
  } // end of button1_ActionPerformed
  // Ende Methoden
  public void receiveData(int time,Boolean Private,String Title,String Description,String place,int jahr, int monat,int tag){
    Termin term=new Termin(time,Private,Title,Description,place);
    Jahre[jahr-2015].addTermin(term,monat,tag);
  }
  public void findClick(int x,int y){
    for (int i=1;i<32;i++) {
      for (int j=1;j<5;j++) {
        if (y>100+(TAB_HOEHE*(i-1))&&y<100+(TAB_HOEHE*i)&&x>100+(TAB_BREITE*(j-1))&&x<100+(TAB_BREITE*j)) {
          System.out.println(i+"."+(pointerm+j)+"."+(pointerj+2015+(((pointerm+j)-((pointerm+j)%12))/12)));
          try{
            fenster Fenster=new fenster(this,"Terminanzeige",true,Jahre[pointerj+(((pointerm+j-1)-((pointerm+j-1)%12))/12)].Monate[(pointerm+j-1)%12].Tage[i-1].getTermine().toTerminArrray());
          }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Dieser Tag existiert nicht!","Fehler",JOptionPane.INFORMATION_MESSAGE);
          }
        } // end of if
      } // end of for
    } // end of for
  }
  public static void main(String[] args) {
    new main("main");
  } // end of main
  
  // end of class ballbuffer
}