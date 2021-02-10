package Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] n = new int[10];

        for (int i = 9; i>=0; i--){
            n[i] = 10-i;
        }
    }
}
