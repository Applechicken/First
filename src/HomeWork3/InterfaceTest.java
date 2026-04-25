package HomeWork3;

interface Canfly{
    void fly();
}
class Bird implements Canfly{
    public void fly(){
        System.out.println("鸟会飞");
    }
}
interface Canswim{
    void swim();
}
class Fish implements Canswim{
    public void swim(){
        System.out.println("鱼会游泳");
    }
}

public class InterfaceTest {
    static void main(String[] args){
        Canfly bird=new Bird();
        bird.fly();
        Canswim fish=new Fish();
        fish.swim();
    }
}
