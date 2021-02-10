package Ex4;

public class Ex4 {
    public static void main(String[] args) {
        int[][] n = new int[50][100];

        for (int i = 99; i>=0; i--){
            n[0][i] = 0+i;
        }
        for(int i = 49; i>=0; i--){
            n[i][0] = i+0;
        }
    }
}
