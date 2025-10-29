package app;
import java.util.Scanner;

public class Teste002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] saldo = new Double[3];

        for(int a=0; a<3;a++){
            saldo[a] = scanner.nextDouble(); }

        // TODO: Implemente a classificação do cliente com base no saldo:
        for(int i = 0; i <3;i++){

            if (saldo[i]<0){
                System.out.println("Negativado");
            }else if(saldo [i] >= 0 && saldo[i] <=500){
                System.out.println("Baixo");
            }else{
                System.out.println("Confortavel");}
        }
        scanner.close();
    }
}