import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        int quociente = numero / 2;
        int resto = numero % 2;

        System.out.println("Quociente da divisão por 2: " + quociente);
        System.out.println("Resto da divisão por 2: " + resto);
    }
}
