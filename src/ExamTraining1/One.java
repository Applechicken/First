package ExamTraining1;

public class One {
    public static void main(String[] args) {
        // 创建两个3行4列的矩阵
        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = new int[3][4];

        // 为矩阵1赋值（0-99随机数）
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 100);
            }
        }

        // 为矩阵2赋值（0-99随机数）
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random() * 100);
            }
        }

        // 计算差值矩阵 result = matrix1 - matrix2
        int[][] result = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // 打印矩阵1
        System.out.println("矩阵1：");
        printMatrix(matrix1);

        // 打印矩阵2
        System.out.println("\n矩阵2：");
        printMatrix(matrix2);

        // 打印结果矩阵
        System.out.println("\n结果矩阵 (A-B)：");
        printMatrix(result);

        // 统计大于平均值的元素个数与总和
        // 1. 计算所有元素的总和及平均值
        int sum = 0;
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                sum += result[i][j];
                count++;
            }
        }

        double average = (double) sum / count;  // 计算平均值

        // 2. 统计大于平均值的元素
        int greaterSum = 0;   // 大于平均值的元素总和
        int greaterCount = 0;  // 大于平均值的元素个数

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] > average) {
                    greaterSum += result[i][j];
                    greaterCount++;
                }
            }
        }

        // 输出统计结果
        System.out.println("\n========== 统计结果 ==========");
        System.out.println("结果矩阵的总元素个数：" + count);
        System.out.println("结果矩阵的总和：" + sum);
        System.out.printf("结果矩阵的平均值：%.2f\n", average);
        System.out.println("大于平均值的元素个数：" + greaterCount);
        System.out.println("大于平均值的元素总和：" + greaterSum);
    }

    // 打印矩阵的方法
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);  // 每个数字占5位，对齐
            }
            System.out.println();  // 每打印完一行换行
        }
    }
}