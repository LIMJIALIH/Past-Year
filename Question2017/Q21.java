
package Question2017;

import java.util.Random;
    public class Q21{
        public static void main(String[] args) {
            Random rand = new Random();
            
            int [] num = new int [100];
            for(int i = 0 ; i<num.length ; i++){
                num[i] = rand.nextInt(101);
            }
            
            boolean isPrime;
            
            for(int i = 0 ; i<num.length ; i++){
                isPrime = false;
                if(num[i]<=3 && num[i]>=2){
                    isPrime = false;
                }
                else if(num[i] % 2 == 0){
                    isPrime = true;
                }
                else{
                    for(int j = 4 ; j<num[i] ; j++){
                        if(num[i]%j == 0){
                            isPrime = true;
                        }
                    }
                }
                if(isPrime){
                    System.out.print("\n" + num[i] + " is not a prime number.");
                }else{
                    System.out.print("\n" + num[i] + " is a prime number");
                }
            }
        }
    }