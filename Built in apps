import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuiltInAppsRemote extends JPanel implements ActionListener {

  private Map<JButton, String> buttonCommands;

  public BuiltInAppsRemote() {
    buttonCommands = new HashMap<>();
    JButton volumeUp = new JButton("Volume Up");
    JButton volumeDown = new JButton("Volume Down");
    JButton launchWebBrowser = new JButton("Launch Web Browser");
    JButton launchMediaPlayer = new JButton("Launch Media Player");
    buttonCommands.put(volumeUp, "volume_up");
    buttonCommands.put(volumeDown, "volume_down");
    buttonCommands.put(launchWebBrowser, "launch_web_browser");
    buttonCommands.put(launchMediaPlayer, "launch_media_player");
    add(volumeUp);
    add(volumeDown);
    add(launchWebBrowser);
    add(launchMediaPlayer);
    volumeUp.addActionListener(this);
    volumeDown.addActionListener(this);
    launchWebBrowser.addActionListener(this);
    launchMediaPlayer.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    String command = buttonCommands.get(button);
    System.out.println("Executing command: " + command);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Built-In Apps Remote");
    frame.add(new BuiltInAppsRemote());
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
