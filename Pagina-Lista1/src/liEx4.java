import java.util.Scanner;
public class liEx4 {
    public static void main(String[] args) {
        System.out.println("1. Escreva um algoritmo para ler um número inteiro e imprimi-lo na tela.\n" +
                "2. Escreva um algoritmo para ler um número inteiro e imprimir na tela seu sucessor e seu\n" +
                " antecessor.");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int nImpresso =  entrada.nextInt();
        System.out.println(nImpresso);
        int nAntecessor = nImpresso - 1;
        int nSucessor = nImpresso + 1;
        System.out.println("Antecessor " + nAntecessor + ", Sucessor: " + nSucessor);

    }
}
