package vooInternacional;

import interfaces.CalculoFactory;
import interfaces.TaxaBagagem;
import interfaces.TaxaEmbarque;

public class CalcularVooInternacional implements CalculoFactory {


    @Override
    public TaxaBagagem criarTaxabagagem() {
        return new TaxaBagagemInternacional();
    }

    @Override
    public TaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueInternacional();
    }
}
