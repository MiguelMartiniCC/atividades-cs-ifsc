import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos do vídeo: ");
        int totSegundos = input.nextInt();

        int horas = totSegundos / 3600;
        int minutos = (totSegundos % 3600) / 60;
        int segundos = totSegundos % 60;

        System.out.println("O vídeo tem duração de: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
    }
}
