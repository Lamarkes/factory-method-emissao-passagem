package vooInternacional;


import interfaces.TaxaEmbarque;

public class TaxaEmbarqueInternacional implements TaxaEmbarque {

    @Override
    public double getTaxaEmbarque() {
        return 0.1;
    }
}
