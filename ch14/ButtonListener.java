import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.getActionCommand());
    if (e.getActionCommand().equals("Press")) {
      System.out.println("Button 1 pressed!");
    } else if (e.getActionCommand().equals("Press2")) {
      System.out.println("Button 2 pressed!");
    }
    System.out.println("Button pressed!");
  }
}
