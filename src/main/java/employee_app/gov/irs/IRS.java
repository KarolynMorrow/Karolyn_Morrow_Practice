package employee_app.gov.irs;

import employee_app.com.hr.personnel.SalariedEmployee;

public class IRS {

    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;


    public void register(TaxPayer taxPayer){
        //Loop through taxpayer array and add employees to each array index. Should I use a nested for loop to grab currentIndex
        //from the taxPayers array and then loop through the arrayList employees
        for(int i = 0; i < taxPayers.length; i++){
            if(taxPayers[i] == null){
                taxPayer = taxPayers[i];
                currentIndex++;
            }
        }

    }

    public double computeTotalMonthlyTaxToCollect(){
        //grab all totalMonthlyTaxes and add together

        return 0;
    }
}
