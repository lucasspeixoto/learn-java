package defaults;

public class Client14 implements Interface1, Interface4 {
    public void methodA() {
        System.out.println("Inside Method A " + Client14.class);
    }

    public static void main(String[] args) {
        Client14 client = new Client14();

        client.methodA();
    }
}