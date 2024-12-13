package arrayExercises;

public class ARRAY_EXERCISE3 {
        public static void main(String[] args) {
            int[] numeros = {2,4,6,8};
            int pares = 0;
            for (int i = 0; i < numeros.length ; i++) {
                if (numeros[i] %2 == 0);
                pares++;
                System.out.println(pares);
            }
        }
}
