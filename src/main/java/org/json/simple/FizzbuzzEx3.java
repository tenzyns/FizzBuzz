package org.json.simple;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FizzbuzzEx3 {

   public static String fizzBuzz(int num) {
        if (num != 0 && num % 15 == 0) {
            return "FizzBuzz";
        } else if (num != 0 && num % 5 == 0) {
            return "Buzz";
        } else if (num != 0 && num % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(num);
    }
    public static void main (String[] args) {

        /* ----- for user input arguments: */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 integers :");
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int lowNum = Math.min(firstNum, secondNum);
        int highNum = Math.max(firstNum, secondNum);
        int fizz = 0;
        int buzz = 0;
        int fizzbuzz = 0;
        for (int i = lowNum; i <= highNum; i++) {
            switch (fizzBuzz(i)) {
                case "Fizz":
                    fizz +=1;
                    break;
                case "Buzz":
                    buzz +=1;
                    break;
                case "FizzBuzz":
                    fizzbuzz += 1;
                    break;
            }

        }

        JSONObject fizzObject = new JSONObject();
        fizzObject.put("fizz", fizz);
        fizzObject.put("buzz", buzz);
        fizzObject.put("fizzbuzz", fizzbuzz);

        try (FileWriter file= new FileWriter("fizzbuzz.json")) {
            file.write(String.valueOf(fizzObject));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
