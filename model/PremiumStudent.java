package model;

public class PremiumStudent extends Student implements Payable {

    public PremiumStudent(String name, String cpf, String email, double baseFee) {
        super(name, cpf, email, baseFee);
    }

    @Override
    public double calculateMonthlyFee() {
        // Implementation for calculating premium fees
        return super.calculateMonthlyFee() * 1.5;
    }

}
