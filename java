import java.util.Scanner;

public class PrimesUpToN {
public static void main(string[] args) {
Scanner sc = new Scanner(System.in);

// Input: N
int N = sc.nextInt();

// Print primes from 2 to N
for (int i = 2; i <= N; i++) {
if (isPrime(i)) {
System.out.print(i +" ");

}

sc.close();

// Helper function to check primality
private static boolean isPrime(int num) {
if (num < 2) return false;
for (int i = 2; i * i <= num; i++) {
if (num % i == 0) return false;

return true;

}
