package vooInternacional;

import interfaces.TaxaBagagem;

public class TaxaBagagemInternacional implements TaxaBagagem {
    @Override
    public double getTaxaBagagem() {
        return 0.05;
    }
}
