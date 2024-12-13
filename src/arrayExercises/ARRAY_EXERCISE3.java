package arrayExercises;

public class ARRAY_EXERCISE3 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3};
        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}