import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TouchscreenRemote extends JPanel implements MouseListener {

  public TouchscreenRemote() {
    addMouseListener(this);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    Point p = e.getPoint();
    System.out.println("Selected option: " + p.x + "," + p.y);
  }

  @Override
  public void mousePressed(MouseEvent e) {}

  @Override
  public void mouseReleased(MouseEvent e) {}

  @Override
  public void mouseEntered(MouseEvent e) {}

  @Override
  public void mouseExited(MouseEvent e) {}

  public static void main(String[] args) {
    JFrame frame = new JFrame("Touchscreen Remote");
    frame.add(new TouchscreenRemote());
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
