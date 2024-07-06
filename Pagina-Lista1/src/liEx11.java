public class liEx11 {
    public static void main(String[] args) {
        System.out.println("10. Escreva um algoritmo que dada uma temperatura em Celsius ele faz a conversão paraFahreheit. A\n" +
                "fórmula para tal conversão é: F = (9 * C + 160) / 5.");

        float celsius = 25f;
        float fahrenheit = (9* celsius + 160)/5;
        System.out.println(celsius + " fica " + fahrenheit + " em fahrenheit");
    }
}
