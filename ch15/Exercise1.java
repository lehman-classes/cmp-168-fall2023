import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Exercise1 extends JFrame {

  public Exercise1() {
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void countDown(int start) {
    if (start == 0) {
      // System.out.println("HOORAY!");
      JOptionPane.showMessageDialog(null, "HOORAY!");
    } else {
      JOptionPane.showMessageDialog(null, start);
      // System.out.println(start);
      countDown(start - 1);
    }
  }

  public static void main(String[] args) {

    Exercise1 e = new Exercise1();
    e.countDown(3);

    e.dispose();

    System.exit(0);

  }
}
