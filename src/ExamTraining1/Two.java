package ExamTraining1;

import static ExamTraining1.One.printMatrix;

public class Two {
    public static void main(String[] args) {
        int[][] matrix1=new int[2][5];
        int[][] matrix2=new int[2][5];
        for (int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                matrix1[i][j]=10 +  (int) (Math.random() * 71 );  //后面的数是范围,80-10+1
            }
        }

        for(int i=0;i< matrix2.length;i++){
            for(int j=0;j< matrix2[i].length;j++){
                matrix2[i][j]= 10 + (int)(Math.random()* 71);
            }
        }

        int[][] result=new int[2][5];       //计算矩阵一*矩阵二
        for (int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                result[i][j]=matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("矩阵1：");
        printMatrix(matrix1);
        System.out.println("矩阵2：");
        printMatrix(matrix2);
        System.out.println("结果矩阵：");
        printMatrix(result);

        int max=0;
        for(int i=0;i< result.length;i++){
            for(int j=0;j< result[i].length;j++){
                if (result[i][j]%2==1){//是奇数
                    if (max<result[i][j]){
                        max=result[i][j];
                    }
                }
            }
        }
        if (max ==0){
            System.out.println("没有奇数");
        }else
            System.out.println("奇数最大为：" + max);

        int min=1000000000;
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                if (result[i][j]%2==0){
                    if (min>result[i][j]){
                        min=result[i][j];
                    }
                }
            }
        }
        if (min==0){
            System.out.println("没有偶数");
        }else
            System.out.println("最小偶数为：" + min);
    }
}
