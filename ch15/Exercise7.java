import java.io.File;

class Exercise7 {

  public void printAllFileAndDirectoryNames(String fName) {
    File f = new File(fName);
    if(f.isDirectory()) {
      String[] files = f.list();
      System.out.printf("Directory: %s\n", fName);
      for(String file : files) {
        printAllFileAndDirectoryNames(file);
      }
    } else {
      System.out.printf("\tFile: %s\n", fName);
    }
  
  }

  public static void main(String[] args) {

    Exercise7 ex = new Exercise7();
    String currentDir = System.getProperty("user.dir");
    ex.printAllFileAndDirectoryNames(currentDir);

    System.exit(0);
  }
}
