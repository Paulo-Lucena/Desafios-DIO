package main;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        double N = leitor.nextDouble();
        double X, Y;
        double div = 0;
        for (int i = 0; i < N; i++) {
            X = leitor.nextDouble();
            Y = leitor.nextDouble();
            if (Y == 0){ System.out.println("divisao impossivel");}
            else{
                div = X / Y;
                System.out.println( String.format("%.1f", div));}
        }
    }

}
