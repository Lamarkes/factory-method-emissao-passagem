package vooNacional;

import interfaces.CalculoFactory;
import interfaces.TaxaBagagem;
import interfaces.TaxaEmbarque;

public class CalcularVooNacional implements CalculoFactory {
    @Override
    public TaxaBagagem criarTaxabagagem() {
        return new TaxaBagagemNacional();
    }

    @Override
    public TaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueNacional();
    }
}
