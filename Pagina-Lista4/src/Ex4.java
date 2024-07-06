import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,00");

        System.out.println("Digite seu peso e sua altura: ");
        float peso = input.nextFloat();
        float altura = input.nextFloat();

        float IMC = peso / (altura * altura);

        if(IMC >= 25){
            System.out.print("Peso: "+peso+"\nAltura: "+altura+"\nIMC: "+df.format((IMC))+"\nAcima do peso: True");
        }else{
            System.out.println("Peso: "+peso+"\nAltura: "+altura+"\nIMC: "+df.format((IMC))+"\nAcima do peso: False");
        }
    }
}
