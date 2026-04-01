import java.util.Scanner;

public class Cifrador{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = leia.nextLine();
        char[] letra =  {'A', 'B', 'C', 'D','E', 'F', 'G', 'H','I', 'J', 'K', 'L','M', 'N', 'O', 'P','Q', 'R', 'S', 'T','U', 'V', 'W', 'X', 'Y', 'Z'};
        for(int i = 0; i <  letra.length; i++){
            System.out.print(" "+letra[i]+" ");

        }
        

        int indice = 0;
        indice = (indice + 5) % 47;
        

    }
}