import java.awt.*;
import java.awt.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 15.03.2015
  * @author 
  */

public class Details extends Dialog {
  // Anfang Attribute
  private Label label1 = new Label();
  private Label label2 = new Label();
  private Label label3 = new Label();
  private Label label4 = new Label();
  private TextArea textArea1 = new TextArea("", 1, 1, TextArea.SCROLLBARS_BOTH);
  // Ende Attribute
  
  public Details(Frame owner, String title, boolean modal,Termin term) { 
    // Dialog-Initialisierung
    super(owner, title, modal);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    label1.setBounds(8, 8, 211, 17);
    label1.setText("Titel:"+term.getTitle());
    cp.add(label1);
    label2.setBounds(8, 32, 211, 25);
    try{
      label2.setText("Uhrzeit:"+Integer.toString(term.getStartTime()).charAt(0)+Integer.toString(term.getStartTime()).charAt(1)+":"+Integer.toString(term.getStartTime()).charAt(2)+Integer.toString(term.getStartTime()).charAt(3));
    }catch (Exception ex){
      try{
        label2.setText("Uhrzeit:0"+Integer.toString(term.getStartTime()).charAt(0)+":"+Integer.toString(term.getStartTime()).charAt(1)+Integer.toString(term.getStartTime()).charAt(2));
      }catch (Exception ex2){
        try{
          label2.setText("Uhrzeit:00:"+Integer.toString(term.getStartTime()).charAt(0)+Integer.toString(term.getStartTime()).charAt(1));
        }catch (Exception ex3){
          try{
            label2.setText("Uhrzeit:00:0"+Integer.toString(term.getStartTime()).charAt(0));
          }catch (Exception ex4){
            label2.setText("Uhrzeit:00:00");
          }
        }
      }
    }
    cp.add(label2);
    label3.setBounds(8, 64, 219, 33);
    label3.setText("Ort:"+term.getPlace());
    cp.add(label3);
    label4.setBounds(8, 104, 227, 33);
    String t;
    if (term.getPrivat()) {
      t="privat";
    }else{
      t="geschäftlich";
    } // end of if
    label4.setText(""+t);
    cp.add(label4);
    textArea1.setBounds(8, 152, 225, 73);
    textArea1.setText("Beschreibung:"+term.getDesc());
    cp.add(textArea1);
    // Ende Komponenten
    
    setResizable(false);
    setVisible(true);
  } // end of public Details
  
  // Anfang Methoden
  // Ende Methoden
  
} // end of class Details
