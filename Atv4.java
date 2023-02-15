package AtividadesLP2;
import java.util.Scanner;

public class Atv4 {
    
    
   public static void main(String[] args) {
       
    System.out.println("Digite um valor em U$: ");
    Scanner input = new Scanner(System.in);
        
        float dolar= input.nextFloat();
        float reais= (dolar*5.10f);
       
    
       	System.out.printf("O valor em em BRL é é %.2f\n",reais);
   }
}
