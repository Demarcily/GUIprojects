import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Notapad {
  public Notapad() {
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
    frame.setContentPane(new Notapad().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

  private JPanel panel1;
  private JButton clearButton;
  private JButton copyButton;
  private JTextArea MainText;
}
