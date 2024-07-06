import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();

        int diaAtual = input.nextInt();
        int mesAtual = input.nextInt();
        int anoAtual = input.nextInt();

        int diasNascimento = ano * 360 + mes * 30 + dia;
        int diasAtual = anoAtual * 360 + mesAtual * 30 + diaAtual;
        int diferencaDias = diasAtual - diasNascimento;
        System.out.println(diferencaDias);
    }
}