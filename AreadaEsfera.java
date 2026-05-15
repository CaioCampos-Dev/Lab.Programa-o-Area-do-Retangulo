import java.util.Scanner;
public class AreadaEsfera {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double P = 3.14;

        System.out.print("Digite o raio da esfera: ");
        int R = ler.nextInt();

        double resultado = 4*P*R*R;
        System.out.println("resultado: " + resultado);
    }
}
