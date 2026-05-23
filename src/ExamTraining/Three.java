package ExamTraining;

import static ExamTraining.One.printMatrix;

public class Three {
    public static void main(String[] args) {
        int[][] matrix1=new int[4][2];
        int[][] matrix2=new int[4][2];
        int[][] result=new int[4][2];

        for (int i=0;i< matrix1.length;i++){
            for(int j=0;j< matrix1[i].length;j++){
                matrix1[i][j]=(int)(Math.random() * 60);
            }
        }

        for (int i=0;i< matrix2.length;i++){
            for (int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=(int)(Math.random()*60);
            }
        }

        for (int i=0;i<4;i++){
            for (int j=0;j<2;j++){
                result[i][j]=matrix1[i][j]-matrix2[i][j];
                if (matrix1[i][j]<matrix2[i][j]){
                    result[i][j]=matrix2[i][j]-matrix1[i][j];
                }
            }
        }

        System.out.println("矩阵一：");
        printMatrix(matrix1);
        System.out.println("矩阵二：");
        printMatrix(matrix2);
        System.out.println("结果矩阵：");
        printMatrix(result);

        int divisibleBy4Count = 0;  // 能被4整除的个数
        int remainingSum = 0;       // 剩余元素（不能被4整除）的总和
        int remainingCount = 0;     // 剩余元素个数

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] % 4 == 0) {
                    divisibleBy4Count++;
                } else {
                    remainingSum += result[i][j];
                    remainingCount++;
                }
            }
        }

        double average = 0;
        if (remainingCount > 0) {
            average = (double) remainingSum / remainingCount;
        }

        System.out.println("能被4整除的数字数量为：" + divisibleBy4Count);
        System.out.printf("剩余元素平均值为：%.2f", average);  // 保留一位小数（与你示例一致）
    }
}
