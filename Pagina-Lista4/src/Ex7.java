import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura, comprimento e largura: ");

        float altura = input.nextFloat();
        float comprimento = input.nextFloat();
        float largura = input.nextFloat();

        float areaPiso = comprimento * largura;
        float volume = altura * comprimento * largura;
        float areaParede = (altura * comprimento)*2 + (altura * largura)*2;


         if (volume >= 500){
             System.out.println("Altura: "+ altura+ "\nComprimento: "+comprimento+"\nArea Piso: "+areaPiso+"\nVolume: "+volume+"\nArea Paredes: "+ areaParede+"\n Ar Pequeno: False "+"| Ar Médio: False "+"| Ar Grande: True");
         }else if((volume >= 101)&&(volume <= 500)){
             System.out.println("Altura: "+ altura+ "\nComprimento: "+comprimento+"\nArea Piso: "+areaPiso+"\nVolume: "+volume+"\nArea Paredes: "+ areaParede+"\nAr Pequeno: False "+"| Ar Médio: True "+"| Ar Grande: False");
         } else{
             System.out.println("Altura: "+ altura+ "\nComprimento: "+comprimento+"\nArea Piso: "+areaPiso+"\nVolume: "+volume+"\nArea Paredes: "+ areaParede+"\n Ar Pequeno: True "+"| Ar Médio: False "+"| Ar Grande: False");
         }
    }
}
