import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App {

  class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.out.println("Button Pressed");
    }
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("My First GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    JButton button = new JButton("Press");

    button.setSize(200, 400);
    button.addActionListener(new ButtonListener()); // Class that implements ActionListener - separate class
    // button.addActionListener(new MyActionListener()); // Class that implements
    // ActionListener - inner class
    // button.addActionListener(new ActionListener() { // anonymous class
    // public void actionPerformed(ActionEvent e) {
    // System.out.println("Button Pressed");
    // }
    // });
    // button.addActionListener(e -> System.out.println("Button Pressed")); //
    // Lambda expression
    JButton button2 = new JButton("Press2");
    button2.addActionListener(new ButtonListener()); // Class that implements ActionListener - separate class
    button2.setBorder(BorderFactory.createLineBorder(Color.RED)); // Sets border to red
    JTextField text = new JTextField("Text Field");
    JLabel label = new JLabel("Label");

    JPanel panel = new JPanel(); // Creates a new panel
    panel.setLayout(new BorderLayout()); // Sets layout to BorderLayout
    panel.add(button, BorderLayout.WEST); // Adds Button to panel
    panel.add(button2, BorderLayout.EAST); // Adds Button to panel
    panel.add(text, BorderLayout.SOUTH); // Adds text to panel
    panel.add(label, BorderLayout.NORTH); // Adds label to panel
    panel.setBackground(Color.YELLOW); // Sets background to yellow
    panel.setBorder(BorderFactory.createLineBorder(Color.BLUE)); // Sets border to blue

    panel.addMouseMotionListener(new MouseMotionListener() {
      public void mouseMoved(MouseEvent e) {
        System.out.printf("Mouse moved to (%d, %d)\n", e.getX(), e.getY());
      }

      public void mouseDragged(MouseEvent e) {
        System.out.printf("Mouse dragged to (%d, %d)\n", e.getX(), e.getY());
      }
    });
    System.out.printf("frame.layout: %s\n", frame.getLayout().getClass().getName());
    System.out.printf("panel.layout: %s\n", panel.getLayout().getClass().getName());

    frame.add(panel); // Adds panel to frame
    frame.setVisible(true);

  }
}
