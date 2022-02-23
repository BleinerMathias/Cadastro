package br.edu.ifsp.scl.ads.pdm.cadastro.model;

public class Form {
    private String name;
    private String phone;
    private String email;
    private Genre genre;
    private String city;
    private String UF;

    public Form() {
    }

    public Form(String name, String phone, String email, Genre genre, String city, String UF) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.genre = genre;
        this.city = city;
        this.UF = UF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", genre='" + genre + '\'' +
                ", city='" + city + '\'' +
                ", UF='" + UF + '\'' +
                '}';
    }
}