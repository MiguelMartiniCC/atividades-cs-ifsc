import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Solicitando os preços das mercadorias no dia 01/01/2022
        System.out.println("Informe o preço das mercadorias no dia 01/01/2022:");
        System.out.print("Mercadoria 1: ");
        double precoMercadoria1_1 = input.nextDouble();
        System.out.print("Mercadoria 2: ");
        double precoMercadoria2_1 = input.nextDouble();
        System.out.print("Mercadoria 3: ");
        double precoMercadoria3_1 = input.nextDouble();

        // Solicitando os preços das mercadorias no dia 01/02/2022
        System.out.println("\nInforme o preço das mercadorias no dia 01/02/2022:");
        System.out.print("Mercadoria 1: ");
        double precoMercadoria1_2 = input.nextDouble();
        System.out.print("Mercadoria 2: ");
        double precoMercadoria2_2 = input.nextDouble();
        System.out.print("Mercadoria 3: ");
        double precoMercadoria3_2 = input.nextDouble();


        double inflacaoMercadoria1 = ((precoMercadoria1_2 - precoMercadoria1_1) / precoMercadoria1_1) * 100;
        double inflacaoMercadoria2 = ((precoMercadoria2_2 - precoMercadoria2_1) / precoMercadoria2_1) * 100;
        double inflacaoMercadoria3 = ((precoMercadoria3_2 - precoMercadoria3_1) / precoMercadoria3_1) * 100;

        double inflacaoMedia = (inflacaoMercadoria1 + inflacaoMercadoria2 + inflacaoMercadoria3) / 3;

        if (inflacaoMedia > 0.55) {
            System.out.println("\nA inflação do período está acima da meta, com uma inflação média de "
                    + inflacaoMedia + "%.");
        } else {
            System.out.println("\nA inflação do período está dentro da meta, com uma inflação média de "
                    + inflacaoMedia + "%.");
        }


    }
}
