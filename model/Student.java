package model;

public class Student implements Payable {
    private String name;
    private String cpf;
    private String email;
    private double baseFee;

    public Student(String name, String cpf, String email, double baseFee) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.baseFee = baseFee;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   

    public void setEmail(String email) {
        this.email = email;
    }  

    private void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }


    
    @Override
    public double calculateMonthlyFee() {
        return baseFee;
    }
}
