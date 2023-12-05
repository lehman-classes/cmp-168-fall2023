import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Exercise2 extends JFrame {

  public Exercise2() {
    super("Exercise 2");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void countUpAfterHooray(int end) {
    if(end == 0) {
      // System.out.println("Hooray!");
      JOptionPane.showMessageDialog(null, "Hooray!");
    } else {
      countUpAfterHooray(end - 1);
      // System.out.println(end);
      JOptionPane.showMessageDialog(null, end);
    }
  }


  public static void main(String[] args) {

    Exercise2 ex2 = new Exercise2();
    ex2.countUpAfterHooray(3);

    ex2.dispose();
    System.exit(0);

  }
}
