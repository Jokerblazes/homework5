package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

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
            return num == 3;
        return num % 10 == 3 || containThree(num / 10);
    }

    private String isMultipleAndReturnResult(int num) {
        String result = "";
        if (num % 3 == 0)
            result += "Fizz";
        if (num % 5 == 0)
            result += "Buzz";
        if (num % 7 == 0)
            result += "Whizz";
        return result;
    }

    public List<String> getResults() {
        return results;
    }
}


