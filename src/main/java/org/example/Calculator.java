package org.example;

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> negatives = new ArrayList<>();
    for (String token : tokens) {
      if (token.isEmpty()) continue;

      int num = Integer.parseInt(token.trim());
      if (num < 0) negatives.add(num);
      sum += num;
    }

    if (!negatives.isEmpty()) {
      throw new IllegalArgumentException(
          "negative numbers not allowed: " +
              negatives.toString().replaceAll("[\\[\\] ]", "")
      );
    }
    return sum;
  }

}
