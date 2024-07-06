public class Ex3 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia dois números, calcule e apresente a soma dos quadrados destes números.
*/
        double a = Math.pow(5, 2);
        double b = Math.pow(3,2);
        double soma = a + b;
        System.out.println("Entrada a1: 5 | Entrada b1: 3 |"+"Soma: "+ soma);

        a = Math.pow(2,2);
        b = Math.pow(6,2);
        soma = a + b;
        System.out.println("Entrada a2: 2 | Entrada b2: 6 |"+"Soma: "+ soma);

        a = Math.pow(0,2);
        b = Math.pow(4,2);
        soma = a + b;
        System.out.println("Entrada a3: 0 | Entrada b3: 4 |"+"Soma: "+ soma);

        a = Math.pow(-3,2);
        b = Math.pow(2,2);
        soma = a + b;
        System.out.println("Entrada a4: -3 | Entrada b4: 2 |"+"Soma: "+ soma);
    }
}
