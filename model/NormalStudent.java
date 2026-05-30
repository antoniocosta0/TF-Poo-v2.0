package model;

public class NormalStudent extends Student implements Payable {

    public NormalStudent(String name, String cpf, String email, double baseFee) {
        super(name, cpf, email, baseFee);
    }

    @Override
    public double calculateMonthlyFee() {
        return super.calculateMonthlyFee();
    }       
}
