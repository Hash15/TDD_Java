package org.example;

public class Calculator {

  public int add(String numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }

    String[] parts = numbers.split("[,\n]");  // split by comma
    int sum = 0;
    for (String part : parts) {
      sum += Integer.parseInt(part);
    }
    return sum;
  }

}
