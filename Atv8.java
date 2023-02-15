package AtividadesLP2;
import java.util.Scanner;

public class Atv8 {
     public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
         
         System.out.println("Escreva a altura da parede: ");
         int alturaParede=input.nextInt();
         System.out.println("Escreva a largura da parede: ");
         int larguraParede=input.nextInt();
         System.out.println("Escreva a altura do azulejo: ");
         int alturaAzulejo=input.nextInt();
         System.out.println("Escreva a largura do azulejo: ");
         int larguraAzulejo=input.nextInt();
  
          
         int  perimetroazulejo=(2*(alturaParede+larguraParede))/(2*(alturaAzulejo+larguraAzulejo));
         System.out.println("você vai utilizar "+perimetroazulejo+" m² de azulejo");
         int  quantideAzulejo=(alturaParede/alturaAzulejo)*(larguraParede/larguraAzulejo);
          System.out.println("você vai utilizar "+quantideAzulejo+" quantidades de azulejo");
         
         
     }
}
