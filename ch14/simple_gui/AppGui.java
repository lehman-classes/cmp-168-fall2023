import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.GridLayout;

class AppGui extends JFrame {

  AppGui() {
    setTitle("My App");
    setSize(100, 100);

    // add components
    JPanel mainContainer = new JPanel();
    mainContainer.setBackground(new Color(20, 145, 245));
    // mainContainer.setLayout(new BorderLayout());
    mainContainer.setLayout(new GridLayout(3, 6));

    for (int i = 0; i < 24; i++) {
      JButton button = new JButton("Button " + (i + 1));
      mainContainer.add(button);
    }

    // mainContainer.add(new JButton("North"), BorderLayout.NORTH);
    // mainContainer.add(new JButton("South"), BorderLayout.SOUTH);
    // mainContainer.add(new JButton("East"), BorderLayout.EAST);
    // mainContainer.add(new JButton("West"), BorderLayout.WEST);
    // mainContainer.add(new JButton("Center"), BorderLayout.CENTER);

    // get the content pane
    // JPanel contentPane = (JPanel) getContentPane();
    // contentPane.setBackground(Color.RED);

    // add mainContainer to the frame
    add(mainContainer);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

}
