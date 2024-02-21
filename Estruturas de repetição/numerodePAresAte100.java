public class numerodePAresAte100 {
    public static void main(String[] args) {
        int loopFinal = 100;

        for (int i = 1; i <= loopFinal; i++) {
            int pares = i % 2;

            if (pares == 0) {
            System.out.println("" + i);
            }
            
        }
    }
}
