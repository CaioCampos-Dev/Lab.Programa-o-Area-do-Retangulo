import java.util.Scanner;

public class AreadoCilindro{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    double P = 3.14;

    System.out.print("Digite o raio do cilindro: ");
    int Z = ler.nextInt();

    double B = P*Z*Z;
    System.out.println("Area da base " + B);

    System.out.println("Digite a altura do cilindro: ");
    double  H = ler.nextInt();

    double L = 2*P*Z*H;
    System.out.println("Area lateral " + L);

    double total = L + B * 2;
    System.out.println("Area total " + total);
}
}