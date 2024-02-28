public class somaElementos {
    public static void main(String[] args) {
        int array[] = {23, 4, 12, 9, 20};
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        System.out.println("Soma dos valores do array: " + soma);
    }
}
