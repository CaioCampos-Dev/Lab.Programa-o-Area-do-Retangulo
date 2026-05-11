import java.util.Scanner;

public class AreadaPiramide{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite a quantidade de lados da piramide ");
    int Z = ler.nextInt();

    int B = Z*Z;

    System.out.println("Area da base " + B);

    System.out.println("Digite o Perímetro da base: ");
    System.out.println("Digite a apotema da piramide");

    int P = ler.nextInt();
    int A = ler.nextInt();

    int L = P*A/2;

    System.out.println("Area lateral " + L);

    double total = L + B;

    System.out.println("Area total " + total);
}
}