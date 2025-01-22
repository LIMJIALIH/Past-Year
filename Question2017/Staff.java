
package Question2017;

class Staff {
    
    private String name;
    private String IC;
    
    public Staff(String name, String IC){
        this.name = name;
        this.IC = IC;
    }
    
    @Override
    public String toString(){
        return "\nFull Name: " + name + "\nIC: " + IC;
    }
}
