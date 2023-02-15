package AtividadesLP2;
import java.util.Scanner;

public class Atv12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor de sua renda: ");
    double rendasalario = sc.nextDouble();
    double irpf = 0;
    if (rendasalario <= 10800) {
      System.out.println("Isento de pagamento");
    } else if (rendasalario <= 21600) {
      irpf = (rendasalario * 0.15) - 1620;
    } else {
      irpf = (rendasalario * 0.275) - 4320;
    }
    if (irpf > 0) {
      System.out.println("O IRPF Simples é R$" + irpf);
    }
  }
}