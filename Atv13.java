package AtividadesLP2;


import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("População: ");
        int populacao = scan.nextInt();
        System.out.println("DIas: ");
        int dia = scan.nextInt();
        if(populacao <=4){
            int valor1= 160;
            System.out.println(populacao * valor1 * dia);
        }
        if(populacao >= 5 && populacao <= 8) {
                int valor2 = 120;   
            System.out.println(populacao * valor2 * dia);
        }
        if(populacao > 8) {
            int z = 80;
            System.out.println(populacao*z * dia);
        }

    }
    
}