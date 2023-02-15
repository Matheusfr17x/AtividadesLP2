package AtividadesLP2;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
    float ValorDia = 45.00f;
    float x=60.00f;
    int quantidadeDias;
    
    System.out.println("quantidade de dias que voce alugou o carro:");
    quantidadeDias=input.nextInt();
    System.out.println("quanto voce andou de carro em km: ");
    float km=input.nextFloat();
    if(km<60.00f){
    System.out.println("o valor a pagar é: 45,00");
    }
    else{
     float kmRodado = (quantidadeDias*ValorDia)+((km-60)*0.50f); 
     System.out.println("o valor a pagar é R$: "+kmRodado);
            
        }
    }
}
