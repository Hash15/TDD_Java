package org.example;

public class Calculator {

  public int add(String numbers) {
    if (numbers.isEmpty()) return 0;

    String delimiter = "[,\n]"; // default delimiters

    // Check for custom delimiter at the beginning
    if (numbers.startsWith("//")) {
      int delimiterEnd = numbers.indexOf("\n");
      delimiter = numbers.substring(2, delimiterEnd);
      numbers = numbers.substring(delimiterEnd + 1);
    }

    String[] tokens = numbers.split(delimiter);
    int sum = 0;
    for (String token : tokens) {
      if (!token.isEmpty()) {
        sum += Integer.parseInt(token.trim());
      }
    }
    return sum;
  }

}
