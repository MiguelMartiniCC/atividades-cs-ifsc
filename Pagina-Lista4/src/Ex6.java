import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as notas das provas, e o trabalho: ");
        int prova1 = input.nextInt();
        int prova2 = input.nextInt();
        int trabalho = input.nextInt();
        System.out.println("Digite a frequência do aluno: ");
        int frequencia = input.nextInt();

        if((((prova1 >=6) || (prova2 >= 6)) && (trabalho >= 7) && (frequencia >= 75))){
            System.out.println("Prova 1: "+prova1+"\nProva 2: "+prova2+"\nTrabalho: "+trabalho + "\nFrequência: " + frequencia+"\nAprovado: True");
        }else if((((prova1 >=6) || (prova2 >= 6)) && (trabalho >= 6) && (frequencia >= 90))){
            System.out.println("Prova 1: "+prova1+"\nProva 2: "+prova2+"\nTrabalho: "+trabalho+ "\nFrequência: " + frequencia+"\nAprovado: True");
        }else{
            System.out.println("Prova 1: "+prova1+"\nProva 2: "+prova2+"\nTrabalho: "+trabalho+"\nFrequência: " + frequencia+"\nAprovado: False");
        }
    }

}
