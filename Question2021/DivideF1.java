
package Question2021;

public class DivideF1 extends Eleven{

    public DivideF1(String fileName) {
        super(fileName);
    }

    @Override
    public String divide() {
        String check = "Divisibility Rule(Formula 1)\n\n";
        for(int i = 0 ; i<integer.length ; i++){
            boolean divisible = false;
            int odd = 0;
            int even = 0;
            int counter = 1;
            String oddString = "";
            String evenString = "";
            int original = integer[i];
            
            while(integer[i] != 0){
                int remainder = integer[i]%10;
                integer[i] /= 10;
                if(counter %2 == 0){
                    even += remainder;
                    evenString = remainder + (evenString.isEmpty() ? "" : " + ") + evenString;
                }else{
                    odd += remainder;
                    oddString = remainder  + (oddString.isEmpty() ? "" : " + ") + oddString;
                }
                counter++;
            }
            
            if(Math.abs(odd-even) % 11 == 0){ divisible = true;}
            else{ divisible = false; }
            
            if(divisible == true){
            check += original + " : |x| = | (" + oddString + ") - (" + evenString + ") | = " + Math.abs(odd-even) + "\n" + Math.abs(odd-even) + " modulus 11 = 0, " + original + " is divisible by 11" + "\n\n";
            }else{
                check += original + " : |x| = | (" + oddString + ") - (" + evenString + ") | = " + Math.abs(odd-even) + "\n" + Math.abs(odd-even) + " modulus 11 is not equal to 0, " + original + " is not divisible by 11" + "\n\n";
            }
        }
        return check;
    }
    
}
