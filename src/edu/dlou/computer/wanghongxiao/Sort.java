package edu.dlou.computer.wanghongxiao;
public class Sort {
    // 题目要求的排序函数：对int数组进行升序排序
    public static void sort(int[] a) {
        // 冒泡排序实现
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // 交换两个元素
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 定义并初始化题目要求的数组
        int[] array = {45, 87, 2, 34, 91, 5, 15, 86, 21, 55};

        // 调用sort函数排序
        sort(array);

        // 输出排序后的结果
        System.out.println("排序后的数组：");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}