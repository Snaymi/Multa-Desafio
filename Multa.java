import java.util.Scanner;

public class Multa {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int velocidade = scan.nextInt();

        int velocmax = 60;

        if (velocidade > velocmax) {

            System.out.print("Foi multado");

        }else {

            System.out.print("Nao foi multado");
        }
    }
}