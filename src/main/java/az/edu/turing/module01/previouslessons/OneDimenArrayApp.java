package az.edu.turing.module01.previouslessons;

public class OneDimenArrayApp {
    public static void main(String[] args) {
        int [] x = new int[]{1,2,3};
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        int [][] xy = new int[][]{
                {4,5,6,7},
                {8,9,10,11}
        };
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy[i].length; j++) {
                System.out.print(xy[i][j] + " ");
            }
            System.out.println();
        }
    }
}
