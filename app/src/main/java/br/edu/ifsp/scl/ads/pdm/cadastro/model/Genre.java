package br.edu.ifsp.scl.ads.pdm.cadastro.model;

public enum Genre {
    MALE("Masculino"),
    FEMALE("Feminino");

    private String label;

    Genre(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
