package app;
import java.util.Scanner;
public class Teste {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeiro numero:");
        int a = scan.nextInt();
        System.out.println("Segundo Numero:");
        int b = scan.nextInt();
        int resuldado = teste(a,b);
        System.out.println("Soma :");
        System.out.println(resuldado);


    }
    public static int teste(int a, int b){
        int soma = a+b;
        return soma;
    }
}
