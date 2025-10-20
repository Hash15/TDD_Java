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
}