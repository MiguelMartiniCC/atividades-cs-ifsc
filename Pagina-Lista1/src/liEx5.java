import java.util.Scanner;

public class liEx5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("4. Escreva um algoritmo para ler um nome, um endereço e um telefone e imprimi-los na tela.");
        System.out.println("Digite o nome do destinatário: ");
        String nomeDestinatario = entrada.next();

        System.out.println("Digite o endereço do destinatário: ");
        String endereco = entrada.next();

        System.out.println("Digite o telefone destinatário: ");
        String telefone = entrada.next();

        System.out.println("Sua entrega vai para: " +nomeDestinatario + ", " + endereco + ", "+ telefone);

    }
}
