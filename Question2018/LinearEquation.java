
package Question2018;

class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public LinearEquation(int a , int b , int c , int d , int e , int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public String toString(){
        return a + "x + " + b+"y = " + e + "\n" + c + "x + " + d + "y = " + f; 
    }
    
    public boolean isSolvable(){
        int determinent = (a*d) - (b*c);
        
        return determinent != 0;
    }
    
    public int computeX(){
        int x=0;
        if(isSolvable() == true){
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        }
        return x;
    }
    
    public int computeY(){
        int y=0;
        if(isSolvable() == true){
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        }
        return y;
    }
}
