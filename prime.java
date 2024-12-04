public class prime {
    static boolean Isprime(int n) {
        // int Count=0;
        if (n < 1) {
            return false;
        }
    
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;

                // Count++;

            }
        }
        return true;
        // return Count==2;
    }

    public static void main(String[] args) {


        System.out.println(Isprime(3));
    }

}
