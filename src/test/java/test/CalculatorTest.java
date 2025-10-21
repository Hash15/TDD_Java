package test;

import static org.junit.jupiter.api.Assertions.*;
import org.example.Calculator;
import org.junit.jupiter.api.*;

class CalculatorTest {

  private Calculator obj;

  @BeforeEach
  public void setup(){
    obj = new Calculator();
  }

  @Test
  void testEmptyStringReturnsZero() {
    assertEquals(0, obj.add("")); // Expect 0 for empty string
  }

  @Test
  void testSingleNumberReturnsThatNumber() {
    assertEquals(1, obj.add("1"));
  }

  @Test
  void testTwoNumbersCommaSeparated() {
    assertEquals(15, obj.add("7,8"));
  }

  @Test
  void testNewLineBetweenNumbers() {
    assertEquals(18, obj.add("4\n6,8"));
  }

  @Test
  void testCustomDelimiter() {
    assertEquals(8, obj.add("//;\n3;5"));
  }

  @Test
  void testNegativeNumberThrowsException() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      obj.add("1,-5,3,-8");
    });

    assertEquals("negative numbers not allowed: -5,-8", exception.getMessage());
  }

}