import java.util.Scanner;

public class AreadoCubo{
public static void main(String[] args){
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite a aresta do cubo: ");
    int A = ler.nextInt();

    double Base = A*A;

    System.out.println("Area da base " + Base);

    double Lateral = 4*(A*A);

    System.out.println("Area lateral " + Lateral);

    double total = 6*(A*A);

    System.out.println("Area total " + total);
}
}
