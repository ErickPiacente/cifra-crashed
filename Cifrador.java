import java.util.Scanner;

public class Cifrador{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String frase = "QUEROSERPROGRAMADORAPRENDIJAVANODEVISATEMARILIA";
        for(int i = 0; i < 47; i++){
        int indice = 0;
        indice = (indice + 5) % 47;
        System.out.println(frase);
        }

    }
}