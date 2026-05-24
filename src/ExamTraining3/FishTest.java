package ExamTraining3;

abstract class LivingBeing {
    public abstract void breath();        //抽象方法breath()
}

interface Action{
    void move();    //运动的行为
}

//鱼类 Fish 继承 LivingBeing 并实现 Action 接口
class Fish extends LivingBeing implements Action {
    //重写所有抽象方法
    public void breath(){
        System.out.println("鱼用鳃呼吸");
    }
    public void move(){
        System.out.println("鱼用鳍游泳");
    }
}

public class FishTest{
    static void main(String[] args) {
        Fish fish=new Fish();
        System.out.println("鱼类特征");
        fish.breath();
        fish.move();
    }
}
