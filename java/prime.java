public class prime {
    public static void main(String[] args) {
        System.out.println(2);
        for(int i=3;i<100;i=i+2){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i=i+1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
