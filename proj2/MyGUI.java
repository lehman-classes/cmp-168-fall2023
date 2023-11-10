import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;

// Purpose: Create a simple GUI window
class MyGUI extends JFrame {
  public MyGUI() {
    super("MyGUI");

    JPanel panel = new JPanel();
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new BorderLayout());
    JLabel buttonLabel = new JLabel("0");
    JButton button = new JButton();
    button.setBackground(new Color(191, 227, 180));
    button.addActionListener(e -> {
      // int count = Integer.parseInt(buttonLabel.getText());
      // buttonLabel.setText(Integer.toString(count + 1));
      // buttonPanel.remove(button);
      button.setText("2");
      button.setEnabled(false);

    });
    buttonPanel.add(buttonLabel, BorderLayout.CENTER);
    buttonPanel.add(button, BorderLayout.CENTER);

    panel.setLayout(new GridLayout(3, 3));
    panel.add(buttonPanel);
    panel.add(new JButton());
    panel.add(new JButton());
    panel.add(new JButton());
    panel.add(new JButton());
    panel.add(new JButton());
    panel.add(new JButton());
    panel.add(new JButton());
    panel.add(new JButton());

    add(panel);

    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
