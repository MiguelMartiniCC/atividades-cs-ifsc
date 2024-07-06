import java.util.Scanner;

public class liEx9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("8. Escreva um algoritmo para ler quatro números, calcular o quadrado de cada um deles, somar tudo e\n" +
                "mostrar o resultado.");

        double quadradoEx8 = 2;
        double nQuardado1 =  entrada.nextDouble();
        double nQuardado2 =  entrada.nextDouble();
        double nQuardado3 =  entrada.nextDouble();
        double nQuardado4 =  entrada.nextDouble();

        System.out.println(Math.pow(nQuardado1, quadradoEx8)+ " Este é o quadrado de: " + nQuardado1);
        System.out.println(Math.pow(nQuardado2, quadradoEx8)+ " Este é o quadrado de: " + nQuardado2);
        System.out.println(Math.pow(nQuardado3, quadradoEx8)+ " Este é o quadrado de: " + nQuardado3);
        System.out.println(Math.pow(nQuardado4, quadradoEx8)+ " Este é o quadrado de: " + nQuardado4);

    }
}
