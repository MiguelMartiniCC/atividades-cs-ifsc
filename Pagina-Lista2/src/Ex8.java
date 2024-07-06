import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor do salário mínimo: ");
        double salMinimo = input.nextDouble();

        System.out.print("Insira a quantidade de vendas: ");
        double qCarrosVendidos = input.nextDouble();

        System.out.print("Insira o valor das vendas: ");
        double valVendas = input.nextDouble();


        double salario = (salMinimo * 2) + (150 * qCarrosVendidos) + ((valVendas*5)/100);
        System.out.print("Salário: " +salario);
    }
}
