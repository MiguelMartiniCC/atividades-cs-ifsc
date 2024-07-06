import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salBruto = input.nextFloat();
        int dependentes = input.nextInt();

        float auxilio = dependentes * 150;

        float salLiquido = salBruto - ((((salBruto *11)/100) + ((salBruto * 15)/100)))+auxilio ;
        System.out.println(salLiquido + " e " + salBruto);

    }
}