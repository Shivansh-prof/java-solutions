/*
    Problem Statement: You are given an n x n 2D matrix representing an image,
    rotate the image by 90 degrees (clockwise).
    You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
    DO NOT allocate another 2D matrix and do the rotation.
*/


public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
//    Brute Force Approach - Using Extra space
//        int[][] newMatrix = new int[n][n];
//        for(int i = 0; i < n ; i++){
//            for (int j=0; j<n; j++){
//                newMatrix[i][j] = matrix[n-1-j][i];
//            }
//        }
//        for(int i = 0; i < n ; i++){
//            for (int j=0; j<n; j++){
//                matrix[i][j] = newMatrix[i][j];
//            }
//        }

//        Optimal approach - 1. Transpose, 2. Reverse Rows
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }


    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        System.out.println("matrix is: \n");
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after rotating by 90degree is : \n");
        rotate(mat);
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
