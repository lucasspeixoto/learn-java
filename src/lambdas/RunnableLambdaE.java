package lambdas;

/*
 * Lambda expressions
 *
 * Lambda expressions are anonymous functions.
 * Lambda expressions can be assigned to a variable.
 * Lambda are not tied to any class like a regular method.
 * Lambda can also be assigned to variable and passed around
 * Lambda is mainly used to implement Functional Interfaces (SAM)
 */

public class RunnableLambdaE {

    public static void main(String[] args) {

        /*
         * Before java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /*
         * After java 8
         * Lambda expressions
         */
        Runnable runnableLambda = () -> System.out.println("Inside Runnable 2");
        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Inside Runnable 3")).start();

    }
}
