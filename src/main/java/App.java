import vooInternacional.CalcularVooInternacional;
import vooNacional.CalcularVooNacional;

public class App {

    public static void main(String[] args) {

        var passagem1 = new GerarPassagem();

        passagem1.gerarPassagem(200,new CalcularVooNacional());

        System.out.println("------------------------------------------");

        var passagem2 = new GerarPassagem();

        passagem2.gerarPassagem(300, new CalcularVooInternacional());


    }
}
