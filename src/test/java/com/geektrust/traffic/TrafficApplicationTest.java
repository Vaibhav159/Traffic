package com.geektrust.traffic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TrafficApplicationTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  public void testForRainy() {
    String path1 = "src/test/resources/input1.txt";
    TrafficApplication.main(new String[]{path1});
    assertEquals("CAR ORBIT2\n", outContent.toString());
  }

  @Test
  public void testForSunny() {
    String path1 = "src/test/resources/input2.txt";
    TrafficApplication.main(new String[]{path1});
    assertEquals("TUKTUK ORBIT1\n", outContent.toString());
  }

  @Test
  public void testForWindy() {
    String path1 = "src/test/resources/input3.txt";
    TrafficApplication.main(new String[]{path1});
    assertEquals("CAR ORBIT2\n", outContent.toString());
  }

  @Test
  public void testForRainy1() {
    String path1 = "src/test/resources/input4.txt";
    TrafficApplication.main(new String[]{path1});
    assertEquals("TUKTUK ORBIT2\n", outContent.toString());
  }

  @Test
  public void testForInvalidFile() {
    String path1 = "src/test/resources/input8.txt";
    TrafficApplication.main(new String[]{path1});
    assertEquals("ERROR :" + path1 + "\n", outContent.toString());
  }
}