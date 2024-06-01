package com.monocept.debug;
import java.io.FileReader;
import java.io.IOException; 

public class FileInputStreams {

  public static void main(String[] args) {
    try {
     
      FileReader fileInputStream = new FileReader("F:\\assinments\\debud\\src\\com\\monocept\\debug\\prateek.txt");

      int ch;
      int chCount = 0;
      
      while ((ch = fileInputStream.read()) != -1) {
        System.out.print((char) ch);
        chCount++;
      }
      
      int characterCount = 0;

      for (ch :FileReader .toCharArray()) {
          if (!Character.isWhitespace(ch)) {
              characterCount++;
          }
      }

      System.out.println("Number of characters excluding spaces: " + characterCount);
      
      fileInputStream.close();
      System.out.print("          Total characters counted: " + chCount);
      

    } catch (IOException e) {
      System.err.println("Error: An error occurred while reading the file: " + e.getMessage());
    }
  }
}
