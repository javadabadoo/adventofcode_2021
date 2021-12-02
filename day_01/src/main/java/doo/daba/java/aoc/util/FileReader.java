package doo.daba.java.aoc.util;

import java.io.*;

public class FileReader {

  public static String readFile(InputStream inputStream) throws IOException {
    StringBuilder content = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = reader.readLine()) != null) {
        content.append(line).append("\n");
      }
    }
    return content.toString();
  }

  public static String readFile(File file) throws IOException {
    if (!file.exists()) {
      throw new RuntimeException("sorry but file " + file.getAbsolutePath() + " couldn't be found");
    }
    if (!file.canRead()) {
      throw new RuntimeException("sorry but file " + file.getAbsolutePath() + " couldn't be read");
    }
    return readFile(new FileInputStream(file));
  }

  public static String readFile(String filePath) throws IOException {
    return readFile(new File(filePath));
  }
}
