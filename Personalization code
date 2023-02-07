import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PersonalizedRemote extends JPanel implements ActionListener {

  private JPanel buttonsPanel;
  private List<JButton> buttons;
  private Color backgroundColor;

  public PersonalizedRemote() {
    backgroundColor = Color.LIGHT_GRAY;
    setLayout(new BorderLayout());
    buttonsPanel = new JPanel();
    buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    buttons = new ArrayList<>();
    buttons.add(new JButton("Volume Up"));
    buttons.add(new JButton("Volume Down"));
    buttons.add(new JButton("Launch Web Browser"));
    buttons.add(new JButton("Launch Media Player"));
    buttonsPanel.setLayout(new GridLayout(2, 2, 10, 10));
    for (JButton button : buttons) {
      button.addActionListener(this);
      buttonsPanel.add(button);
    }
    add(buttonsPanel, BorderLayout.CENTER);
    JButton backgroundColorButton = new JButton("Change Background Color");
    backgroundColorButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        backgroundColor = backgroundColor == Color.LIGHT_GRAY ? Color.WHITE : Color.LIGHT_GRAY;
        setBackground(backgroundColor);
        buttonsPanel.setBackground(backgroundColor);
      }
    });
    add(backgroundColorButton, BorderLayout.SOUTH);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    System.out.println("Executing command for button: " + button.getText());
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Personalized Remote");
    PersonalizedRemote remote = new PersonalizedRemote();
    remote.setPreferredSize(new Dimension(400, 300));
    frame.add(remote);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
