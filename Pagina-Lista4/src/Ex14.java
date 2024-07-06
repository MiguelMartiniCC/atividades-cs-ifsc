import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        float notaP = input.nextFloat();
        float notaM = input.nextFloat();
        float notaCG = input.nextFloat();

       float media = (notaP + notaM + notaCG )/3;

        System.out.println(nome + "\nNota Português: " + notaP+"\nNota Matemática: "+notaM+"\nNota Conhecimentos Gerais: "+ notaCG);
        System.out.println(media);
        if((media >= 7) && (notaP >= 5) && (notaM >= 5) && (notaCG >= 5)){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
