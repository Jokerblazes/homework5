package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int num1 = 3;
    private int num2 = 5;
    private int num3 = 7;

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            String result;
            if (containThree(i))
                result = "Fizz";
            else {
                result = isMultipleAndReturnResult(i);
                if (result.length() == 0)
                    result = String.valueOf(i);
            }
            results.add(result);
        }
    }


    private boolean containThree(int num) {
        if (num / 10 == 0)
            return num == num1;
        return num % 10 == num1 || containThree(num / 10);
    }

    private String isMultipleAndReturnResult(int num) {
        String result = "";
        if (num % num1 == 0)
            result += "Fizz";
        if (num % num2 == 0)
            result += "Buzz";
        if (num % num3 == 0)
            result += "Whizz";
        return result;
    }

    public List<String> getResults() {
        return results;
    }
}


