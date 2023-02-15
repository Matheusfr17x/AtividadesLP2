
package AtividadesLP2;

import java.util.Scanner;

public class Atv6 {
     public static void main(String[] args) {
         
        Scanner input= new Scanner(System.in);
           
        int base;
        int h;
         
        System.out.println("area e perimetro de um retangulo: ");
        System.out.println("Digite o numero da base do retangulo: ");
        base=input.nextInt();
         
        System.out.println("Digite o o numero altura do retangulo: ");
        h=input.nextInt();
        int area=base*h;
        
        System.out.println("A area do retangulo é: " + area);
        int perimetro=(2*base)+(2*h);
         System.out.println("o perimetro é: "+ perimetro);
            
     }
}
