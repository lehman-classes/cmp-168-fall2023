import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Exercise4 extends JFrame{

  public Exercise4() {
    super("Exercise 4");
    setSize(300, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void countToZero(int start) {
    if(start == 0) {
      JOptionPane.showMessageDialog(null, "Hooray!");
    } else {
      JOptionPane.showMessageDialog(null, start);
      start = start < 0 ? start + 1 : start - 1;
      countToZero(start);
    }
  }


  public static void main(String[] args) {

    Exercise4 ex = new Exercise4();
    ex.countToZero(-4);

    ex.dispose();
    System.exit(0);

  }
}
