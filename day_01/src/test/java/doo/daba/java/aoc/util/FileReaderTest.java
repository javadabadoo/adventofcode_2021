package doo.daba.java.aoc.util;

import doo.daba.java.aoc.util.FileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class FileReaderTest {

  @Test
  public void testFileRead() throws IOException {
    String content = FileReader.readFile(getClass().getClassLoader().getResource("day_01/data.txt").getFile());
    assertNotNull(content);
  }

  @Test
  public void testFileReadFailed() throws IOException {
    assertThrowsExactly(RuntimeException.class, () -> FileReader.readFile("file_not_exist"));
  }
}
