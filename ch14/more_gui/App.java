// video link here top of class

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

  public static JPanel createPanel(int rows, int cols) {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(rows, cols));
    int totalCells = rows * cols;
    for (int i = 0; i < totalCells; i++) {
      JButton button = new JButton();

      // instead of setting the text to the index of the button, it should be set to
      // either 0 if not bombs around or the number of bombs around
      // you might need to call another function to get the number of bombs around
      // you also need to check if there is a bomb in the current cell. if there is a
      // bomb.
      button.setActionCommand(String.valueOf(i));

      button.setBackground(Color.LIGHT_GRAY);
      button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String command = e.getActionCommand();
          // still need to check if there is a bomb in the current cell
          // if there is a bomb, then the game is over
          // also, you need to check if there are no more cells to click (You won!, if no
          // more cells to click)
          button.setText(command);
          button.setBackground(Color.CYAN);
          button.setEnabled(false);
        }
      });
      panel.add(button);
    }
    return panel;
  }

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

    JPanel panel = createPanel(5, 5);
    frame.add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
