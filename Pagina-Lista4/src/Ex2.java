import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        float precoQW = input.nextFloat();
        int quantidadeQW = input.nextInt();

        float vConta = precoQW * quantidadeQW;

        System.out.println("Preço do Quilowatt: " + precoQW +"\n Quantidade de quilowatt: " + quantidadeQW+"\nConta: " + df.format(vConta)+ "\nConta atraso: "+ df.format((vConta*0.10)+vConta));

    }
}
