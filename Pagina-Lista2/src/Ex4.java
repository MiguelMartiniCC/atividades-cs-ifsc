public class Ex4 {
    public static void main(String[] args) {
        double a = 5;
        double b = 3;

        double soma = a + b;
        soma = Math.pow(soma, 2);

        System.out.println("Entrada a1: 5 | Entrada b1: 3 |"+"Soma: "+ soma);

        a = 2;
        b = 6;
        soma = a + b;
        soma = Math.pow(soma, 2);
        System.out.println("Entrada a2: 2 | Entrada b2: 6 |"+"Soma: "+ soma);

        a = 0;
        b = 4;
        soma = a + b;
        soma = Math.pow(soma, 2);
        System.out.println("Entrada a3: 0 | Entrada b3: 4 |"+"Soma: "+ soma);

        a = -3;
        b = 2;
        soma = a + b;
        soma = Math.pow(soma, 2);
        System.out.println("Entrada a4: -3 | Entrada b4: 2 |"+"Soma: "+ soma);
    }
}
