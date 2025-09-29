/*
    Problem Statement: Given an unsorted array of integers nums,
    return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatrixZero {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i=0; i<n; i++){
            for (int j=0;j<m; j++){
                if(matrix[i][j]==0){
                    markRows(matrix,n,m,i);
                    markCols(matrix,n,m,j);
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    private static void markRows(int[][] matrix,int n, int m,int i){
        for(int j = 0; j<m; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }
    private static void markCols(int[][] matrix,int n, int m,int j){
        for(int i = 0; i<n; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }


    public static void main(String[] args) {
        int[][] mat = {
                {0,1,2,0},{3,4,5,2},{1,3,1,5}
        };
        System.out.println("matrix is: \n");
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after setting zeros is : \n");
        setZeroes(mat);
        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
