package doo.daba.java.aoc.day01;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class TestMeasurement {

  @Test
  public void testInitialCase() throws IOException {
    Measurement measurement = new Measurement(getClass().getClassLoader().getResource("day_01/test_data.txt").getFile());
    assert measurement.calculateIncreases(measurement.extractMeasurements()) == 7;
  }

  @Test
  public void testData() throws IOException {
    Measurement measurement = new Measurement(getClass().getClassLoader().getResource("day_01/data.txt").getFile());
    assert measurement.calculateIncreases(measurement.extractMeasurements()) == 1532;
  }

  @Test
  public void testGroupMeasurementInitialCase() throws IOException {
    Measurement measurement = new Measurement(getClass().getClassLoader().getResource("day_01/test_data.txt").getFile());
    int sum = measurement.calculateGroupedIncreases(measurement.extractMeasurements());
    assert 5 == sum;
  }

  @Test
  public void testGroupMeasurement() throws IOException {
    Measurement measurement = new Measurement(getClass().getClassLoader().getResource("day_01/data.txt").getFile());
    int sum = measurement.calculateGroupedIncreases(measurement.extractMeasurements());
    assert 1571 == sum;
  }
}
