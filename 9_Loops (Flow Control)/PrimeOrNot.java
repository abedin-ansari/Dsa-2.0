import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("It is a prime");
        } else {
            Boolean isPrime = true;

            // loop from 2 to √n → check divisibility
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("It is a prime");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}

// 🔑 Short Logic Explanation (for revision):

// 👉 Prime means divisible only by 1 and itself.
// 👉 So, check divisibility from 2 to √n.
// 👉 If divisible → not prime, else prime. ✅
