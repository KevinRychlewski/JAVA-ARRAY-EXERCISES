package arrayExercises;
public class ARRAY_EXERCISE1 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5};
        int soma = 0;

        for(int i = 0; i < numeros.length; ++i) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}