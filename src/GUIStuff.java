import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIStuff {
  public GUIStuff() {
    panel = new JPanel();
    text = new JTextArea(30, 70);
    panel.add(text);

    button = new JButton("Clear");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        text.setText("");
      }
    });
    panel.add(button);

    button = new JButton("Copy");
    button.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(text.getText());
      }
    });
    panel.add(button);



  }

  public static void main(String[] args) {
    JFrame fr = new JFrame ("Exempel");

    GUIStuff suffering = new GUIStuff();

    fr.setContentPane(suffering.panel);

    fr.pack();
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setVisible(true);

  }

  private JButton button;
  private JTextArea text;
  private JPanel panel;

}
