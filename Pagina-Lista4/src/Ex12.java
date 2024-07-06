import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        if(A == B){
            System.out.println("Iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}
