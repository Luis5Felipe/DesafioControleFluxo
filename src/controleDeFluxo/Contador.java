package controleDeFluxo;

public class Contador {
    private int valor1;
    private int valor2;

    public Contador(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public static void checarparametros(int valor1, int valor2)
    {
          try {
              if (valor1 > valor2){
                  throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro," +
                          " Digite de novo");
              }
              imprimir(valor1, valor2);

          }catch (ParametrosInvalidosException exception){
              System.out.println(exception.getMessage());
          }
    }

    public static void imprimir(int valor1, int valor2)
    {
        int contagem = valor2 - valor1;
        for (int i = 0; i < contagem; i++) {
          System.out.println("Imprimindo o número " + (i+1));
        }
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}
