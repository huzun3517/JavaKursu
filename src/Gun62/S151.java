package Gun62;

public class S151 {
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh){
        acct.addKWh(kWh);
    }
}


class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addKWh(double kWh)
    {
        if (kWh>0)
        {
            this.kWh +=kWh;
            this.bill = this.kWh * rate;
        }
    }

    // line n1
}