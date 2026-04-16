import java.util.Scanner;
import java.text.Normalizer;
public class Cifrador{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String frase = "Quero ser programador. Aprendi Java no Devisate. Marília";
        System.out.println(frase);
                frase = Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                frase = frase.replaceAll("[^a-zA-Z0-9]", "");

        frase = frase.toUpperCase();
        char[] letra =  {'A', 'B', 'C', 'D','E', 'F', 'G', 'H','I', 'J', 'K', 'L','M', 'N', 'O', 'P','Q', 'R', 'S', 'T','U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println(frase);
 
        for(int i = 0; i < frase.length(); i++){
        char posiçãoAtual = frase.charAt(i);
        if(i == 0){
            System.out.print(posiçãoAtual);
            continue;
        }
        for(int p = 0; p < letra.length; p++){
            if(posiçãoAtual == letra[p]){
            int novaPosição = (p + 3) % 26;
            System.out.print(letra[novaPosição]);
            break;
            }
        }
        
        
        
        }

        

        
        
        

    }
}