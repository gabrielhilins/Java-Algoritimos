public class encontraMaximo {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 4, 5};
        int contador = 0;

        int maximo = achaOMaximo(array, contador);
        System.out.println("O maior valor encontrado é: " + maximo);
    }

    static int achaOMaximo(int[] array, int contador) {
        int maior = array[0]; // Inicializa o maior valor com o primeiro elemento do array
        for (int i = 1; i < array.length; i++) { // Começa do segundo elemento
            if (array[i] > maior) {
                maior = array[i]; // Atualiza o maior valor encontrado, se necessário
            }
        }
        return maior; // Retorna o maior valor encontrado
    }
}
