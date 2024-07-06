import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da pista (em Km): ");
        double tamanhoPista = scanner.nextDouble();

        System.out.println("Informe o peso do avião (em toneladas): ");
        double pesoAviao = scanner.nextDouble();

        System.out.println("Informe a visibilidade (em metros): ");
        int visibilidade = scanner.nextInt();

        System.out.println("Informe a intensidade da chuva (em mm): ");
        double chuva = scanner.nextDouble();

        System.out.println("Informe o número de passageiros: ");
        int passageiros = scanner.nextInt();

        System.out.println("O avião possui sistema de decolagem automatizada? (true/false): ");
        boolean sistemaDecolagem = scanner.nextBoolean();

        boolean podeDecolar = true;

        if (chuva > 5) {
            podeDecolar = false;
        } else if (passageiros > 100 && chuva > 0) {
            podeDecolar = false;
        } else if (tamanhoPista < 1.5 && pesoAviao > 40) {
            podeDecolar = false;
        } else if (tamanhoPista >= 1.5 && tamanhoPista < 2 && pesoAviao > 60) {
            podeDecolar = false;
        } else if (visibilidade < 20 && !sistemaDecolagem) {
            podeDecolar = false;
        }

        if (podeDecolar) {
            System.out.println("O avião pode decolar.");
        } else {
            System.out.println("O avião não pode decolar.");
        }
    }
}
