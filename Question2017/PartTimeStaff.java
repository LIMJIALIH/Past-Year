
package Question2017;


public class PartTimeStaff extends Staff{
    
    private int hours;
    
    public PartTimeStaff(String name, String IC,  int hours) {
        super(name, IC);
        this.hours = hours;
    }
    
    public double getSalary(){
        return 40*hours;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNumber of working hours: " + hours + "\nSalary: RM " + (int)getSalary();
    }
}
