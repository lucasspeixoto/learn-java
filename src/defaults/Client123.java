package defaults;

/*
Classe Abstrata:
 É uma classe que não pode ser instanciada diretamente.
 Ela pode conter tanto métodos abstratos (sem implementação) quanto métodos
  concretos (com implementação). Seu propósito é fornecer uma base comum para outras classes,
  permitindo que compartilhem código e características comuns.
Interface:
 Uma interface é um contrato que define um conjunto de métodos que uma classe deve implementar.
 Ela só pode declarar métodos (a partir do Java 8, também pode conter métodos default
  com implementação e métodos estáticos). As interfaces são usadas principalmente
  para definir capacidades que classes distintas podem compartilhar, sem uma relação hierárquica.
 */

public class Client123 implements Interface1, Interface2, Interface3 {

    public void methodA() {
        System.out.println("Inside Method A " + Client123.class);
    }

    public static void main(String[] args) {
        Client123 client = new Client123();

        client.methodA(); //resolve to the child implementation
        client.methodB();
        client.methodC();
    }
}
