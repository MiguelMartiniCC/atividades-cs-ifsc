import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor das parcelas: ");
        int valorParcela = input.nextInt();

        System.out.println("Digite a quantidade de parcelas: ");
        int quantidadeParcelas = input.nextInt();

        System.out.println("Digite a quantidade de parcelas pagas: ");
        int quantidadePagas = input.nextInt();

        System.out.println("Total já pago: " + quantidadePagas * valorParcela);
        System.out.println("Saldo devedor: " + (quantidadeParcelas - quantidadePagas) * valorParcela);

    }
}
