package Ex1;


public class Ex1 {
    public static void main(String[] args) {
        int[] n = new int[9];

        for (int i = 0; i<9; i++){
            n[i] = i;
        }

        for (int i = 0; i<9; i++){
            System.out.println(n[i]);
            n[i] *= 3;
        }

        for (int i = 0; i<9; i++){
            System.out.println(n[i]);
        }
    }
}
