package edu.dlou.computer.wanghongxiao;

import edu.dlou.computer.tria.Tria;
import edu.dlou.computer.circ.Circ;
import edu.dlou.computer.rect.Rect;

import java.awt.geom.Area;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("圆半径：");
        double radius =sc.nextDouble();
        Circ circ = new Circ(radius);
        System.out.println("周长：" + circ.getArea());
        System.out.println("面积：" + circ.getPerimeter());

        System.out.println("长方形长：");
        double rectLength = sc.nextDouble();
        System.out.println("长方形宽：");
        double rectWidth = sc.nextDouble();
        Rect rect = new Rect(rectLength, rectWidth);
        if(rect.isValid()){
            System.out.println("周长:" + rect.getArea());
            System.out.println("面积:" + rect.getPerimeter());
        }else System.out.println("ERROR");

        System.out.println("三角形三条边长度：");
        double Length1=sc.nextDouble();
        double Length2=sc.nextDouble();
        double Length3=sc.nextDouble();
        Tria tria = new Tria(Length1, Length2, Length3);
        if (tria.isValid()) {
            System.out.println("周长：" + tria.getPerimeter());
            System.out.println("面积：" + tria.getArea());
        }else System.out.println("ERROR");
        System.out.println("public权限面积方法：" + rect.getAreaPublic());
    }
}
