package AtividadesLP2;

import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("digite alguma palavra");
        String palavra = scan.next();
        int contador = 0;
        int i = 0;
        while(i < palavra.length()) {
                i++;}
        if(palavra.substring(i, i-1).equals("a") ||
                palavra.substring(i, i-1).equals("A")){
                contador++;
        }        
        System.out.println(i);
    }
    
}
