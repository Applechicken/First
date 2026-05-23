package ExamTraining;

import static ExamTraining.One.printMatrix;

public class Four {
    public static void main(String[] args) {
        int[][] matrix1=new int[3][3];
        int[][] matrix2=new int[3][3];
        int[][] result=new int[3][3];

        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                matrix1[i][j]=5 + (int)(Math.random()*91);
            }
        }

        for (int i=0;i<matrix2.length;i++){
            for (int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=5 + (int)(Math.random()*91);
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (matrix1[i][j]<matrix2[i][j]){
                    result[i][j]=matrix2[i][j];
                }else
                    result[i][j]=matrix1[i][j];
            }
        }

        System.out.println("矩阵一：");
        printMatrix(matrix1);
        System.out.println("矩阵二：");
        printMatrix(matrix2);
        System.out.println("结果矩阵：");
        printMatrix(result);

        // 先把9个数放到一维数组里
        int[] arr = new int[9];
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[idx++] = result[i][j];
            }
        }

// 挨个比较
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("重复个数为：" + count);
    }
}
