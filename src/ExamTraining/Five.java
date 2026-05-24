package ExamTraining;

import static ExamTraining.One.printMatrix;
import static java.lang.IO.println;

public class Five {
    static void main(String[] args) {
        int[][] matrix1=new int[5][3];
        int[][] matrix2=new int[5][3];
        for (int i=0;i< matrix1.length;i++){
            for (int j=0;j< matrix1[i].length;j++){
                matrix1[i][j]=20 + (int)(Math.random()*51);
            }
        }

        for (int i=0;i< matrix2.length;i++){
            for (int j=0;j< matrix2[i].length;j++){
                matrix2[i][j]=20 + (int)(Math.random()*51);
            }
        }

        int sum=0;
        int count=0;

        int[][] result=new int[5][3];
        for (int i=0;i< 5;i++){
            for (int j=0;j< 3;j++){
                result[i][j]=matrix1[i][j]*2-matrix2[i][j];
                if (result[i][j]<20){
                    result[i][j]=20;
                }
                sum+=result[i][j];
                count++;

            }
        }
        double average=(double)sum/count;
        System.out.println("矩阵一：");
        printMatrix(matrix1);
        System.out.println("矩阵二：");
        printMatrix(matrix2);
        System.out.println("结果矩阵：");
        printMatrix(result);

        System.out.println("总和为：" + sum);
        System.out.printf("平均值为：%.2f\n" ,  average);
    }
}
