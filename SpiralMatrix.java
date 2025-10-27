/*
    Problem Statement: Given an m x n matrix, return all elements of the matrix in spiral order.
*/


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, bottom = n-1, left = 0, right = m-1;
        while(top<=bottom && left<=right){
            //print left to right
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }top++;
            //print top to bottom
            for(int i = top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }right--;
            //print right to left
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //print bottom to top
            if(left<=right){
                for(int i = bottom; i>=top;i--){
                    result.add(matrix[i][left]);
                }left++;
            }
        }
        return result;
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
        System.out.println("Matrix after converting into spiral is : "+ spiralOrder(mat));

    }
}
