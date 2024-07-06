import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        float vTipo1 = 1.50f;
        float vTipo2 = 2f;
        float vTipo3 = 0.75f;

        System.out.println("Insira a quantidade de picolés do tipo 1 vendido: ");
        Scanner input = new Scanner(System.in);
        int qTipo1 = input.nextInt();

        System.out.println("Insira a quantidade de picolés do tipo 2 vendido: ");
        int qTipo2 = input.nextInt();

        System.out.println("Insira a quantidade de picolés do tipo 3 vendido: ");
        int qTipo3 = input.nextInt();

        float vendaTipo1 = vTipo1 * qTipo1 ;
        float vendaTipo2 = vTipo2 * qTipo2 ;
        float vendaTipo3 = vTipo3 * qTipo3 ;
        float totVendas = vendaTipo1 + vendaTipo2 + vendaTipo3;

        System.out.println("Vendas tipo 1: "+vendaTipo1);
        System.out.println("Vendas tipo 2: "+vendaTipo2);
        System.out.println("Vendas tipo 3: "+ vendaTipo3);
        System.out.println("Total de vendas de todos os tipos: "+totVendas);

    }
}
