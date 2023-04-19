package employee_app.com.hr.corp;

import employee_app.gov.irs.TaxPayer;

public class Corporation implements TaxPayer {

    private String name;
    private double monthlyIncome;

    @Override
    public double computeMonthlyTaxToPay() {
        return monthlyIncome * CORP_TAX_RATE;
    }
}
