import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import java.util.*;

/*

You can compile and run your code with the following commands (make sure the unit testing jar file from Lab1 is in your current directory)

Windows:
javac -classpath ".;junit-platform-console-standalone-1.7.0-M1.jar" *.java
java -classpath ".;junit-platform-console-standalone-1.7.0-M1.jar" org.junit.runner.JUnitCore Exam1_Tester

Mac/Linux:
javac -classpath ".:junit-platform-console-standalone-1.7.0-M1.jar" *.java
java -classpath ".:junit-platform-console-standalone-1.7.0-M1.jar" org.junit.runner.JUnitCore Exam1_Tester

*/

public class Exam1_Tester {

  @Test
  public void test1() {
    Deciduous maple = new Deciduous("star", 14, 0, 128, 43);
    assertEquals("14 star (0, 128, 43)", maple.toString());
  }
  
  @Test
  public void test2() {
    Evergreen fir = new Evergreen("needle", 11, 0, 51, 51);
    assertEquals("11 needle (0, 51, 51)", fir.toString());
    assertEquals("default", fir.getConeShape());
    fir.setConeShape("small");
    assertEquals("small", fir.getConeShape());
  }

  @Test
  public void test3() {
    Deciduous maple = new Deciduous("star", 14, 0, 128, 43);
    Evergreen fir = new Evergreen("needle", 11, 0, 51, 51);
    fir = new Evergreen("needle", 11, 0, 51, 51);
    fir = new Evergreen("needle", 11, 0, 51, 51);
    assertEquals(4, Tree.numEvergreen);
  }

  @Test
  public void test4() {
    Deciduous birch = new Deciduous("triangle", 14, 2, 130, 44);
    birch.fall();
    assertEquals(102, birch.getFallColorRed());
    assertEquals(127, birch.getFallColorGreen());
    assertEquals(54, birch.getFallColorBlue());
  }

  @Test
  public void test5() {
    Evergreen cedar = new Evergreen("spiky", 14, 2, 130, 44);
    cedar.fall();
    assertEquals(2, cedar.getFallColorRed());
    assertEquals(127, cedar.getFallColorGreen());
    assertEquals(44, cedar.getFallColorBlue());
  }

  @Test
  public void test6() {
    Deciduous birch = new Deciduous("triangle", 14, 2, 130, 44);
    birch.grow(3);
    assertEquals(17, birch.getRings());
  }

  @Test
  public void test7() {
    Evergreen cedar = new Evergreen("spiky", 1, 2, 130, 44);
    cedar.grow(2);
    assertEquals(3, cedar.getRings());
  }

  @Test
  public void test8() {
    Deciduous birch = new Deciduous("triangle", 14, 2, 130, 44);
    Evergreen cedar = new Evergreen("spiky", 1, 2, 130, 44);
    assertEquals(1, birch.compareTo(cedar));
    assertEquals(-1, cedar.compareTo(birch));
    assertEquals(0, cedar.compareTo(cedar));
    assertEquals(-2, cedar.compareTo(null));
  }

  @Test
  public void test9() {
    ArrayList<Tree> forest = new ArrayList<Tree>();
    forest.add(new Deciduous("triangle", 14, 2, 130, 44));
    forest.add(new Evergreen("spiky", 1, 2, 130, 44));
    String printout = Arrays.toString(forest.toArray());
    assertEquals("[14 triangle (2, 130, 44), 1 spiky (2, 130, 44)]", printout);
    for(int i = 0; i < forest.size(); i++){
      Tree tree = forest.get(i);
      tree.fall();
      tree.grow(2);
    }
  }

}
