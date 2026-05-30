package model;

public class Athlete extends Student {
    private String name;
    private String cpf;
    private String email;

    public Athlete(String name, String cpf, String email) {
        super(name, cpf, email);    
    }

    private String getName() {
        return name;
    }

    private String getCpf() {
        return cpf;
    }

    private String getEmail() {
        return email;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    // Sobrescrita do método toString() para exibir nome, CPF e email do atleta
    @Override 
    public String toString() {
        return "Name: " + name + "\nCPF: " + cpf + "\nEmail: " + email;
    }
}
