//Write a class named Commission
//Edited by : Dhiya Fakhar Nafi

public class Commission extends Hourly {	//It extends the Hourly class
	//Two instance variables 
    private double totalSale;
    private double commissionRate;
    
    //The constructor takes 6 parameters:
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);	//The constructor should call the constructor of the parent class with the first 5 parameters 
        this.commissionRate = commissionRate;				//use the 6th to set the commission rate.
    }
    
    //One additional method : public void addSales (double totalSales) that adds the parameter to the instance variable representing total sales
    public void addSale(double moreSale) {
        this.totalSale += moreSale;
    }
    
    //The pay method must call the pay method of the parent class to compute the pay for hours worked then add to that the pay from commission on sales. 
    public double pay() {
        double x = super.pay() + this.totalSale + this.commissionRate;
        this.totalSale = 0;
        return x;
    }
    
    //The toString method needs to call the toString method of the parent class then add the total sales to that.
    public String toString() {
        return super.toString() + "\nTotal Sale: " + this.totalSale + "\n";
    }
}