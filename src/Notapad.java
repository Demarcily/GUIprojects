import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class Notapad {
  public Notapad() {
    menuBar = new JMenuBar();
    menu = new JMenu("File");
    menu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(menu);




    clearButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
      MainText.setText("");
      }
    });
    copyButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
      System.out.println(MainText.getText());
      }
    });

  }




  public static void main(String[] args) {
    JFrame frame = new JFrame("Notapad");
    Notapad helpme = new Notapad();
    frame.setContentPane(new Notapad().panel1);
    frame.setJMenuBar(helpme.menuBar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);



  }

  private JPanel panel1;
  private JButton clearButton,copyButton;
  private JTextArea MainText;
  private JMenuBar menuBar;
  private JMenu menu;
  private JMenuItem Item1;
}
