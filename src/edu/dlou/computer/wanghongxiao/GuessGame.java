package edu.dlou.computer.wanghongxiao;


import java.util.Random;
import java.util.Scanner;

class Guess {
    private int value; // 私有成员变量，封装目标值

    // 构造器：随机生成1~100之间的整数（可调整范围）
    public Guess() {
        Random random = new Random();
        this.value = random.nextInt(100) + 1; // 范围：1~100
    }

    // 提供getter方法，让外部类可以获取目标值进行比较
    public int getValue() {
        return value;
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Guess target = new Guess(); //生成随机数
        Scanner scanner = new Scanner(System.in);
        int guessNum;

        System.out.println("🎮 猜数字游戏开始！目标数字在1~100之间");
        while (true) {
            System.out.print("请输入你的猜测：");
            guessNum = scanner.nextInt();

            if (guessNum > target.getValue()) {
                System.out.println("太大了");
            } else if (guessNum < target.getValue()) {
                System.out.println("太小了");
            } else {
                System.out.println("成功，正确数字是：" + target.getValue());
                break;
            }
        }
        scanner.close();
    }
}