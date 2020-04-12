package vgerasimov.task1;

public class FizzBuzzImplement implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
        }
    }

}
