package HomeWork1;

class Shape {
    String color;
}
class Triangle extends Shape {
    double t1,t2,t3;
    boolean TrueTriangle;
    Triangle(){     //无参数
        this.color="white";
        this.t1=0;
        this.t2=0;
        this.t3=0;
        this.TrueTriangle=false;
    }

    Triangle(String c,double T1,double T2,double T3){       //第二类
    this.color=c;
    this.t1=T1;
    this.t2=T2;
    this.t3=T3;
    this.TrueTriangle=checkTriangle();
    }

    Triangle(double R1,double R2,double R3){    //第三类
        this.color="white";
        this.t1=R1;
        this.t2=R2;
        this.t3=R3;
        this.TrueTriangle=checkTriangle();
    }

    boolean TrueTriangle(){     //判断是否合法
        return t1>0 && t2>0 && t3>0 && t1+t2>t3 && t1+t3>t2 && t2+t3>t1;
    }

    boolean checkTriangle(){    //判断是否为直角三角形
        if(!TrueTriangle) return false;
        double k1 = t1 * t1;
        double k2 = t2 * t2;
        double k3 = t3 * t3;
       return (k1 + k2 ==k3) | (k1+k3==k2) | (k2+k3==k1);
    }

    double Perimeter(){
        if(!TrueTriangle()) return 0;   //周长
        return t1+t2+t3;
    }
    double Area(){
        if(!TrueTriangle()) return 0;
        double S = Perimeter() / 2;
        return Math.sqrt(S*(S-t1)*(S-t2)*(S-t3));
    }
}

class Circle extends Shape {
    double radius;

    Circle(){
        this.color="white";
        this.radius=0;
    }
    Circle(double r1,String C){
        this.color=C;
        this.radius=r1;
    }

    boolean TrueCircle() {
        return radius>0;
    }

    double Area(){//面积
        if(!TrueCircle()) return 0;
        return radius*radius*3.14;
    }

    double Perimeter(){//周长
        if(!TrueCircle()) return 0;
        return 2*3.14*radius;
    }
}

public class Test {
    static void main(String[] args) {
        Triangle Triangle1=new Triangle(3,4,5); //直角三角形判别
        System.out.println("边长 3，4，5");
        System.out.println("是否可为三角形：" + (Triangle1.TrueTriangle() ?"是" : "否"));
        System.out.println("是否为直角三角形:" + (Triangle1.checkTriangle() ?"是" : "否"));
        System.out.println("周长：" + Triangle1.Perimeter());
        System.out.println("面积：" + Triangle1.Area());

        Triangle Triangle2=new Triangle(2,3,4); //非直角三角形判别
        System.out.println("边长 2，3，4");
        System.out.println("是否可为三角形：" + (Triangle2.TrueTriangle() ?"是" : "否"));
        System.out.println("是否为直角三角形:" + (Triangle2.checkTriangle() ?"是" : "否"));
        System.out.println("周长：" + Triangle2.Perimeter());
        System.out.println("面积：" + Triangle2.Area());

        Triangle Triangle3=new Triangle(3,4,8); //非直角三角形判别
        System.out.println("边长 3,4,8");
        System.out.println("是否可为三角形：" + (Triangle3.TrueTriangle() ?"是" : "否"));
        System.out.println("是否为直角三角形:" + (Triangle3.checkTriangle() ?"是" : "否"));
        System.out.println("周长：" + Triangle3.Perimeter());
        System.out.println("面积：" + Triangle3.Area());

        Circle circle=new Circle(3,"white");

        System.out.println("圆半径：3");
        System.out.println("周长：" + circle.Perimeter());
        System.out.println("面积：" + circle.Area());
    }
}
