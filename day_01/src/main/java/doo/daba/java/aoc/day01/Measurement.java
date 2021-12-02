package doo.daba.java.aoc.day01;

import doo.daba.java.aoc.util.FileReader;
import lombok.Data;
import lombok.NonNull;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Data
public class Measurement {

  private static final int WINDOW_WIDTH = 3;

  private String filePath;

  public Measurement(String filePath) {
    this.filePath = filePath;
  }

  public List<Integer> extractMeasurements() throws IOException {
    String fileContent = FileReader.readFile(this.filePath);
    return Arrays.stream(fileContent.split("\n")).mapToInt(Integer::parseInt).boxed().toList();
  }

  public int calculateIncreases(@NonNull final List<Integer> measurement) {
    final MeasurementReduce mr = new MeasurementReduce();
    measurement.forEach(
        m -> { if (m > mr.getLastValue()) mr.incrementCounterAndSetLastValue(m); else mr.setLastValue(m); }
    );
    return mr.getCounter() - 1;
  }

  public int calculateGroupedIncreases(@NonNull final List<Integer> measurement) {
    final List<Integer> sums = IntStream.range(0, measurement.size()).boxed().filter(i -> measurement.size() >= i + WINDOW_WIDTH)
        .map(i -> measurement.subList(i, i + WINDOW_WIDTH).stream().reduce(0, Integer::sum)).toList();
    return calculateIncreases(sums);
  }

}

@Data
class MeasurementReduce {
  private int lastValue;
  private int counter;

  public void incrementCounterAndSetLastValue(int lastvalue) {
    this.lastValue = lastvalue;
    counter++;
  }
}
