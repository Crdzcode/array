package Ex3;

public class Ex3 {
    public static void main(String[] args) {
        int[][] n = new int[100][100];

        for (int i = 0; i<100; i++){
            n[0][i] = 0-i;
            System.out.println(n[0][i]);
            n[0][i] *= 7;
        }
        for (int i=0; i<100; i++){
            n[i][0] = i-0;
            System.out.println(n[i][0]);
            n[i][0] *= 7;
        }
        for (int i = 0; i<100; i++){
            System.out.println(n[0][i]);
        }
        for (int i = 0; i<100; i++){
            System.out.println(n[i][0]);
        }
    }
}
