import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiDeviceRemote extends JPanel implements ActionListener {

  private Map<JButton, String> buttonCommands;

  public MultiDeviceRemote() {
    buttonCommands = new HashMap<>();
    JButton volumeUp = new JButton("Volume Up");
    JButton volumeDown = new JButton("Volume Down");
    JButton powerOnSoundbar = new JButton("Power On Soundbar");
    JButton powerOffSoundbar = new JButton("Power Off Soundbar");
    JButton powerOnBluRay = new JButton("Power On Blu-Ray Player");
    JButton powerOffBluRay = new JButton("Power Off Blu-Ray Player");
    buttonCommands.put(volumeUp, "volume_up");
    buttonCommands.put(volumeDown, "volume_down");
    buttonCommands.put(powerOnSoundbar, "power_on_soundbar");
    buttonCommands.put(powerOffSoundbar, "power_off_soundbar");
    buttonCommands.put(powerOnBluRay,
