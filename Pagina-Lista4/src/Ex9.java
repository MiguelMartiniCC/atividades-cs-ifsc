import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorCompra = input.nextInt();
        int valorPago = input.nextInt();
        int valorTroco = valorCompra - valorPago;

        if((valorTroco >= 100)){
//            (valorTroco/100) ;
        }
        System.out.println("");
    }
}
