package edu.dlou.computer.wanghongxiao;

import java.util.Scanner;

public class Fruit {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("小明要吃什么\n");
        String n=sc.nextLine();
        if (n.equals("香蕉")){
            System.out.println("剥了皮吃");
        }else if (n.equals("苹果")){
            System.out.println("削了皮吃");
        }else if(n.equals("椰子")){
            System.out.println("钻一个孔来喝");
        }else {
            System.out.println("没买");
        }

        sc.close();
    }
}
