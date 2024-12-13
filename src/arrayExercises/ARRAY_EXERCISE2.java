package arrayExercises;

public class ARRAY_EXERCISE2 {
    public static void main(String[] args) {
            int[] numeros = new int[]{1, 2, 3, 4, 5};
            int armanezador = 3;

            for(int i = 0; i < numeros.length; ++i) {
                if (numeros[i] == armanezador) {
                    System.out.println("Valor encontrado");
                    break;
                }
                System.out.println("Valor nao encontrado");
            }
        }
}
