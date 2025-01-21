 
package Question2016;
/*
class FinancialRecord{
    private int id;
    private double balance;
    private double annualInterestRate;
    
    public FinancialRecord(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }
    
    public FinancialRecord(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestrate(){
        return getAnnualInterestRate()/12;
    }
    
    public void withdraw(double withdraw){
        System.out.print("\nPrevious balance: RM " + this.balance);
        this.balance -= withdraw;
        System.out.print("\nCurrent balance after withdrawal of RM " + withdraw + " is: RM" + this.balance);
    }
    
    public void deposit(double deposit){
        System.out.print("\nPrevious balance: RM" + this.balance);
        this.balance += deposit;
        System.out.print("\nCurrent balance after deposit of RM" + deposit + " is: RM" + this.balance);
    }
    
    public void displayRecordInfo(){
        System.out.print("\nFinancial record id is: " + this.id);
        System.out.print("\nFinancial record balance is: RM" + this.balance);
        System.out.print("\nAnnual Interest Rate is: " + this.annualInterestRate);
    }
}

public class Q26 {
    public static void main(String[] args) {
        System.out.print("\nThe information about financial record A is as follows:");
        FinancialRecord recordA = new FinancialRecord(1234,10000);
        recordA.setAnnualInterestRate(7.77);
        recordA.displayRecordInfo();
        
        System.out.print("\n\nThe information about financial record B is as follows:");
        FinancialRecord recordB = new FinancialRecord(1235,20000);
        recordB.setAnnualInterestRate(8.0);
        recordB.displayRecordInfo();
        System.out.print("\nThe monthly interest rate is: " + recordB.getMonthlyInterestrate());
        recordB.deposit(1500);
        recordB.withdraw(500);
    }
}
*/