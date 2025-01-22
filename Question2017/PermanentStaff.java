
package Question2017;

public class PermanentStaff extends Staff{
    
    private String grade;
    
    public PermanentStaff(String name, String IC,String grade) {
        super(name, IC);
        this.grade = grade;
    }
    
    public double getSalary(){
        if(grade.equalsIgnoreCase("EM01")){
            return 7000;
        }else if(grade.equalsIgnoreCase("EM02")){
            return 5000;
        }else if(grade.equalsIgnoreCase("EM03")){
            return 3000;
        }else if(grade.equalsIgnoreCase("EM04")){
            return 1000;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nGrade: " + grade + "\nSalary: RM " + (int)getSalary();
    }
}
