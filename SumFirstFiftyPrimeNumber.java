
public class SumFirstFiftyPrimeNumber {
	public static void main(String[] args) {
        int number = 1;
        int count = 0;
        int sum = 0;
        int [] prime = new int[51];
        while(count <50){ 
            if(isPrimeNumber(number)){
            	prime[count]=number;
                sum += number;
                System.out.println("Prime number[" + count + "] is: "+ prime[count]);
                count++;
            }
            number++;
        }
        
        System.out.println("Sum is: " + sum);
	}	
	
	public static boolean isPrimeNumber(int number) {
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
