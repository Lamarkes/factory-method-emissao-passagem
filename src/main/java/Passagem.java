import interfaces.CalculoFactory;
import interfaces.TaxaBagagem;
import interfaces.TaxaEmbarque;
import lombok.Data;

@Data
public class Passagem {


    private double valor;
    private TaxaEmbarque taxaEmbarque;
    private TaxaBagagem taxaBagagem;

    public Passagem(double valor, CalculoFactory calculoFactory) {
        this.valor = valor;
        this.taxaBagagem = calculoFactory.criarTaxabagagem();
        this.taxaEmbarque = calculoFactory.criarTaxaEmbarque();
    }

    public double calcularTaxaEmbarque(){
        return this.valor * this.taxaEmbarque.getTaxaEmbarque();
    }

    public double calcularTaxaBagagem(){
        return this.valor * this.taxaBagagem.getTaxaBagagem();
    }
}
