package vooNacional;

import interfaces.TaxaEmbarque;

public class TaxaEmbarqueNacional implements TaxaEmbarque {
    @Override
    public double getTaxaEmbarque() {
        return 0.05;
    }
}
