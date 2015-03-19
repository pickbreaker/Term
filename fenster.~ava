import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 28.02.2015
  * @author 
  */

public class fenster extends Dialog{
  // Anfang Attribute
  private Termin[] data;
  private List list1 = new List();
  private Button button1 = new Button();
  private Button button2 = new Button();
  private Frame father;
  // Ende Attribute
  public fenster(Frame owner, String title, boolean modal,Termin[] term) { 
    // Dialog-Initialisierung
    super(owner, title, modal);
    int frameWidth = 347; 
    int frameHeight = 267;
    father=owner;
    setSize(frameWidth, frameHeight);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    data=term;
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    list1.setBounds(32, 24, 121, 177);
    cp.add(list1);
    button1.setBounds(208, 56, 81, 33);
    button1.setLabel("Detail");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    cp.add(button1);
    button2.setBounds(208, 128, 81, 33);
    button2.setLabel("OK");
    button2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button2_ActionPerformed(evt);
      }
    });
    cp.add(button2);
    // Ende Komponenten
    setResizable(false);
    setVisible(true);
  } // end of public fenster
  // Anfang Methoden
  public void paint(Graphics g){
    list1.clear();
    for (int i=0;i<data.length;i++) {
      try{
        list1.add(data[i].getTitle());
      }catch(Exception ex){
        list1.add("");
      }
    } // end of for
  }
  public void button1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    try{
      Details detailfenster=new Details(father,"Termindetails",true,data[list1.getSelectedIndex()]);
    }catch (Exception ex){
      JOptionPane.showMessageDialog(null,"Wähle einen Termin aus!","Fehler",JOptionPane.INFORMATION_MESSAGE);
    }
  } // end of button1_ActionPerformed
  
  public void button2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    this.dispose();
  } // end of button2_ActionPerformed
  
  // Ende Methoden
} // end of class Frame
