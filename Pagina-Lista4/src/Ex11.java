import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância a ser percorrida em Km: ");
        double distancia = input.nextDouble();

        System.out.print("Digite o consumo médio do carro em Km/litro: ");
        double consumoMedio = input.nextDouble();

        System.out.print("Digite o preço do litro do combustível em R$: ");
        double precoCombustivel = input.nextDouble();
        double gastosCombustivel = (distancia / consumoMedio) * precoCombustivel;

        System.out.println("O valor a ser gasto com combustível na viagem é: R$" + gastosCombustivel);
    }
    }

