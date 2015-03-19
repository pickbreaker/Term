import java.awt.*;
import java.awt.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 28.02.2015
  * @author 
  */

public class fenster extends Dialog {
  // Anfang Attribute
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
  // Ende Attribute
  
  public fenster(Frame owner, String title, boolean modal) { 
    // Dialog-Initialisierung
    super(owner, title, modal);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { 
        
      dispose(); }
    });
    int frameWidth = 500; 
    int frameHeight = 230;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    textField1.setBounds(16, 40, 209, 25);
    cp.add(textField1);
    label1.setBounds(16, 16, 110, 20);
    label1.setText("Titel");
    cp.add(label1);
    textField2.setBounds(16, 96, 209, 25);
    cp.add(textField2);
    label2.setBounds(16, 72, 110, 20);
    label2.setText("Ort");
    cp.add(label2);
    numberField1.setBounds(272, 40, 33, 25);
    numberField1.setText("");
    cp.add(numberField1);
    numberField2.setBounds(320, 40, 33, 25);
    numberField2.setText("");
    cp.add(numberField2);
    numberField3.setBounds(368, 40, 57, 25);
    numberField3.setText("");
    cp.add(numberField3);
    label3.setBounds(272, 16, 110, 20);
    label3.setText("Datum");
    cp.add(label3);
    label4.setBounds(272, 72, 110, 20);
    label4.setText("Uhrzeit");
    cp.add(label4);
    numberField4.setBounds(272, 96, 33, 25);
    numberField4.setText("");
    cp.add(numberField4);
    label5.setBounds(312, 96, 11, 25);
    label5.setText(":");
    cp.add(label5);
    numberField5.setBounds(328, 96, 33, 25);
    numberField5.setText("");
    cp.add(numberField5);
    checkbox1.setBounds(400, 96, 57, 25);
    checkbox1.setLabel("Privat");
    cp.add(checkbox1);
    textArea1.setBounds(16,200,441,20);
    textArea1.setText("");
    cp.add(textArea1);
    // Ende Komponenten
    
    
    
    setResizable(false);
    setVisible(true);
  } // end of public fenster
  
  // Anfang Methoden
  public int getTime(){
    return Integer.parseInt(numberField4.getText()+numberField5.getText()); 
  }
  public int getYear(){
    return  Integer.parseInt(numberField3.getText());
  }
  public int getMonth(){
    return  Integer.parseInt(numberField2.getText());
  }
  public int getDay(){
    return Integer.parseInt(numberField1.getText());
  }
  public String getTitle(){
    return textField1.getText();
  }
  public String getPlace(){
    return textField2.getText();
  }
  public Boolean getPrivate(){
    return checkbox1.getState();
  }
  public String getDesc(){
    return textArea1.getText();
  }
  // Ende Methoden
  
} // end of class Frame
