import static org.json.simple.FizzbuzzEx3.fizzBuzz;

public class FizzbuzzEx2 {

    public static void main (String[] args) {

        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
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
        System.out.println("fizz: " + fizz);
        System.out.println("buzz: " + buzz);
        System.out.println("fizzbuzz: " + fizzbuzz);

    }
}
