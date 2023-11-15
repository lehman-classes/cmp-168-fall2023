import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class App {

  public static void main(String[] args) {

    JFrame frame = new JFrame();

    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem menuItem = new JMenuItem("New");
    menuItem.addActionListener(e -> System.out.println("New menu item clicked"));
    menu.add(menuItem);

    JMenuItem menuItem2 = new JMenuItem("Open");
    menuItem2.addActionListener(e -> System.out.println("Open menu item clicked"));
    menu.add(menuItem2);

    JMenuItem menuItem3 = new JMenuItem("Exit");
    menuItem3.addActionListener(e -> System.exit(0));
    menu.add(menuItem3);

    menuBar.add(menu);

    frame.setJMenuBar(menuBar);
    frame.getContentPane().setBackground(Color.YELLOW);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 5));
    for (int i = 0; i < 25; i++) {
      JButton button = new JButton();
      button.setActionCommand(String.valueOf(i));
      button.setBackground(Color.LIGHT_GRAY);
      button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String command = e.getActionCommand();
          button.setText(command);
          button.setBackground(Color.CYAN);
          button.setEnabled(false);
        }
      });
      panel.add(button);
    }
    frame.add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
