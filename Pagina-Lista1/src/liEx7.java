import java.util.Scanner;

public class liEx7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("6. Escreva um algoritmo para calcular o consumo médio de um automóvel (medido em Km/l), dado\n" +
                "que são conhecidos a distância total percorrida e o volume de combustível consumido para percorrêla (medido em litros). Fórmula: consumo = distancia / volume");
        System.out.println("Digite em seguida a distância total percorrida, e o volume de combustível consumido: ");

        float distCorrida = entrada.nextFloat();
        float volCombust = entrada.nextFloat();
        float consumo = distCorrida / volCombust;

        System.out.println("Você teve o consumo de: "+ consumo);

    }
}
