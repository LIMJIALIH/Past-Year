
package Question2019;

public class QuadraticEquation {
    
    private int a;
    private int b;
    private int c;
    
    public QuadraticEquation(int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public int getC(){
        return c;
    }
    
    public int Discriminant(){
        return (int)(Math.pow(b, 2) - (4*a*c));
    }
    
    public int calcRoot1(){
        int r1;
        if(Discriminant() < 0){
            return 0;
        }
        else{
            r1 = (int)((-b) + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
            return r1;
        }
    }
    
    public int calcRoot2(){
        int r2;
        if(Discriminant() < 0){
            return 0;
        }
        else{
            r2 = (int)((-b) - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
            return r2;
        }
    }
}
