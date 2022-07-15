import static org.json.simple.FizzbuzzEx3.fizzBuzz;
//import methods from other
public class FizzbuzzEx1 {

    static void instances(int num1, int num2) {
        int lowNum = Math.min(num1, num2);
        int highNum = Math.max(num1, num2);
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
        System.out.println("Buzz: " + buzz);
        System.out.println("Fizzbuzz: "+ fizzbuzz);

    }

    public static void main (String[] args) {
       instances(0, 2);
       instances(15, 30);

    }
}
