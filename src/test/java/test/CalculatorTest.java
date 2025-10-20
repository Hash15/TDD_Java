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
}