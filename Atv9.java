
package AtividadesLP2;

import java.util.Scanner;

public class Atv9 {
    
    public static void main(String[] args) {
         
    Scanner input = new Scanner(System.in);
    
        System.out.println("escreva a altura do terreno");
        int altura=input.nextInt();
        System.out.println("escreva a largura do terreno");
        int largura=input.nextInt();
     
        System.out.println("a area do terreno é: "+largura*altura);
        System.out.println("escreva a area construida do terreno: ");
        
        
        float areaConstruida=input.nextFloat();
        
        float impostoAConstruida = areaConstruida*5.00f;
        
        
        float impostoANConstruida = ((largura*altura)-areaConstruida)*3.80f;
        float totalImposto=impostoAConstruida+impostoANConstruida;
        
        
        System.out.println("seu imposto R$: "+totalImposto);
    }
}
