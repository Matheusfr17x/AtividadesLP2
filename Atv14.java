package AtividadesLP2;

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        System.out.println("escreva alguma palavra: ");
        
        String palavra = scan.next();
        
        for(int i=0; i<palavra.length(); i++){
           if(palavra.substring(i, i+1).equals("a") || palavra.substring(i, i+1).equals("A")){
                    contador++;                
                }
            }
            System.out.println(contador);
        } 
}

