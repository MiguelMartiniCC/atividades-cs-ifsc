import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tempo = input.nextFloat();
        float dist = input.nextFloat();

        if(dist <= 200){
            System.out.println("Tempo: "+tempo+"\nDistância: "+dist+"\nPerigo: True");
        }else{
            System.out.println("Tempo: "+tempo+"\nDistância: "+dist+"\nPerigo: False");
        }

    }
}
