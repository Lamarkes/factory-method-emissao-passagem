import interfaces.CalculoFactory;

public class GerarPassagem {


    public Passagem gerarPassagem(double valor, CalculoFactory calculoFactory){
        var passagem = new Passagem(valor,calculoFactory);
        System.out.println("Valor da passagem R$:" + passagem.getValor());
        System.out.println("Valor da Taxa de bagagem R$:"+ passagem.calcularTaxaBagagem());
        System.out.println("Valor da Taxa de embarque R$:"+ passagem.calcularTaxaEmbarque());

        return null;
    }
}
