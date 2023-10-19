import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class App {

  public static void duplicateFile(File source, File target) {
    Scanner scanner = null;
    FileWriter writer = null;
    try {
      scanner = new Scanner(source);
      writer = new FileWriter(target);
      while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        writer.append(data + "\n");
      }
    } catch (IOException ioe) {
      System.out.println("Error while reading from file: " + ioe);
    } finally {
      if (scanner != null) {
        scanner.close();
      }
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException ioe) {
          System.out.println("Error while closing file writer: " + ioe);
        }
      }
    }
  }

  public static void appendNewLines(File file, int howManyLines) {
    FileWriter writer = null;
    try {
      writer = new FileWriter(file, true);
      for (int i = 0; i < howManyLines; i++) {
        writer.append("Line " + (i + 1) + "\n");
      }
    } catch (IOException ioe) {
      System.out.println("Error while appending new lines to file: " + ioe);
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException ioe) {
          System.out.println("Error while closing file writer: " + ioe);
        }
      }
    }
  }

  public static void main(String[] args) {

    File file;
    Scanner scanner = null;
    FileWriter writer = null;
    try {

      // fileUpdater
      File source = new File("data/data.txt");
      File target = new File("data/data_updated.txt");
      duplicateFile(source, target);
      appendNewLines(target, 5);

      file = new File("data/test.txt");
      file.createNewFile(); // if file exists, this doesn't do anything

      if (file.exists()) {
        System.out.println("File created successfully.");
      } else {
        System.out.println("File not created.");
      }

      if (file.canRead()) {
        System.out.println("File can be read.");
      } else {
        System.out.println("File cannot be read.");
      }

      // reading from file using the Scanner class
      if (file.length() == 0) {
        System.out.println("File is empty.");
      } else {
        System.out.println("File is not empty.");
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          String data = scanner.nextLine();
          System.out.println("Data read from file: " + data);
        }
      }

      if (file.canWrite()) {
        System.out.println("File can be written.");

        // write to file using the PrintWriter class
        writer = new FileWriter(file, true);
        // this will overwrite the existing data in the file
        // writer.println("new data written to file");

        // appending new data to the file
        writer.append("new data appended to file\n");
      } else {
        System.out.println("File cannot be written.");
      }

      if (file.canExecute()) {
        System.out.println("File can be executed.");
      } else {
        System.out.println("File cannot be executed.");
      }

      System.out.println("File name: " + file.getName());
      System.out.println("File path: " + file.getPath());
      System.out.println("File absolute path: " + file.getAbsolutePath());
      System.out.println("File relative path: " + file.getCanonicalFile());
      System.out.println("File parent: " + file.getParent());
      System.out.println("File length: " + file.length());
      System.out.println("File last modified: " + file.lastModified());
      System.out.println("File is a directory: " + file.isDirectory());

    } catch (IOException ioe) {
      System.out.println("Error while creating empty file: " + ioe);
    } catch (SecurityException se) {
      System.out.println("Security exception. Not allowed to create file: " + se);
    } catch (Exception e) {
      System.out.println("Unexpected exception: " + e);
      e.printStackTrace();
    } finally {
      System.out.println("Finally block executed.");
      if (scanner != null) {
        scanner.close();
      }
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException ioe) {
          System.out.println("Error while closing file writer: " + ioe);
        }
      }
    }
  }
}
