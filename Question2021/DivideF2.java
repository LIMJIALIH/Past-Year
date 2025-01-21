
package Question2021;


class DivideF2 extends Eleven{


    public DivideF2(String fileName) {
        super(fileName);
    }

    @Override
    public String divide() {
        String check = "Divisibility Rule(Formula 2)\n\n";
        
    for(int i = 0 ; i < integer.length ; i++){
        boolean divisible = false;
        int original = integer[i];
        String num = "";
        
        while(integer[i]>=100){
            int remainder = integer[i]%10;
            integer[i] /= 10;
            num += integer[i] + " - " + remainder + " * 1 = " + (integer[i]-remainder) + ", ";
            integer[i] = integer[i]-remainder;
            
        }
        if(integer[i] %11 == 0){ divisible = true;}
        else{ divisible = false;}
        
        if(divisible == true){
        check += original + " : " + num + ", x = " + integer[i] + "\n" + integer[i] + " modulus 11 = 0, " + original + " is divisible by 11\n\n";  
        }
        else{
        check += original + " : " + num + ", x = " + integer[i] + "\n" + integer[i] + " modulus 11 is not equal to 0, " + original + " is not divisible by 11\n\n";  
        }
    }
    
    return check;
    }
}
