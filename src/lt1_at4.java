import java.util.Scanner;
public class lt1_at4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Req_1: Pedir 4 notas bimestrais.
        System.out.print("Entre com a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println();
        System.out.print("Enrar com a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println();
        System.out.print("Entrar com a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.println();
        System.out.print("Entrar com a quarta nota: ");
        double n4 = sc.nextDouble();
        sc.close();
        
        //Req_2: Calcular e imprimir a média das notas

        double media = (n1 + n2 + n1 + n1) / 4;

        System.out.println("A média das quatro notas é: " + media);
    }
}
