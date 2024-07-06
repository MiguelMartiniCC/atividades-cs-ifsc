import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 999:");
        int numero = input.nextInt();

        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
