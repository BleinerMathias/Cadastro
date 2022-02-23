package br.edu.ifsp.scl.ads.pdm.cadastro.model;

public class EmailList {
    private Form form;

    public EmailList() {
    }

    public EmailList(Form form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "\n" + form.getEmail();
    }
}