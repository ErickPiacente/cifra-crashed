import java.util.Scanner;

public class Cifrador{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = leia.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();
        System.out.println(frase);
        int tamanho = frase.length();
        int indice = 0;
        int posição = 0;
        while (indice < frase.length()) {
        System.out.print((frase.charAt(posição))); //Arrumar o salto que está dando algum erro de calculo
        
        posição = (posição + 5) % tamanho;
        indice++;
        }
        

        
        
        

    }
}