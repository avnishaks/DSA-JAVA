package Array_String;
// Given an integer n, return the number of prime numbers that are strictly less than n.
import java.util.Scanner;

public class count_prime {
    public static int findPrime(int n){
        // All are false
        boolean [] prime=new boolean[n+1];

        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=2*i;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }

        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]==false){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println(findPrime(value));
    }
}
