package ExamTraining3;

abstract class Animal{
    public abstract void sleep();  //休息
}

interface  Hobby{
    void getBenefit();      //喜好
}

class Dog extends Animal implements Hobby{
    //重写方法
    public void sleep(){
        System.out.println("它们白天游玩晚上休息");
    }

    public void getBenefit(){
        System.out.println("喜好吃的食物大部分是肉类");
    }
}

public class AnimalTest {
    static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println("狗类习性");
        dog.sleep();
        dog.getBenefit();
    }
}
