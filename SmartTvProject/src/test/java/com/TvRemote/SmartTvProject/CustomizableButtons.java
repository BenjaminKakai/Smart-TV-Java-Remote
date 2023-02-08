import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustomizableRemote extends JPanel implements ActionListener {

  private Map<JButton, String> buttonCommands;

  public CustomizableRemote() {
    buttonCommands = new HashMap<>();
    JButton volumeUp = new JButton("Volume Up");
    JButton volumeDown = new JButton("Volume Down");
    JButton launchNetflix = new JButton("Launch Netflix");
    buttonCommands.put(volumeUp, "volume_up");
    buttonCommands.put(volumeDown, "volume_down");
    buttonCommands.put(launchNetflix, "launch_netflix");
    add(volumeUp);
    add(volumeDown);
    add(launchNetflix);
    volumeUp.addActionListener(this);
    volumeDown.addActionListener(this);
    launchNetflix.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    String command = buttonCommands.get(button);
    System.out.println("Executing command: " + command);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Customizable Remote");
    frame.add(new CustomizableRemote());
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
