import controleDeFluxo.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean checagem = true;
        do {
            System.out.println("Digite o primeiro valor");
            int valor = input.nextInt();
            System.out.println("Digite o segundo valor");
            int valo2 = input.nextInt();
            Contador.checarparametros(valor, valo2);
            if (valor < valo2) {
                checagem = false;
            }
        }while (checagem);
        input.close();
    }
}