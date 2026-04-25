package HomeWork1;

class Animal{
    protected String name;
    public Animal(String Name){
        this.name=Name;
    }
    protected void makeSound(){   //受保护方法
        System.out.println(name + "发出叫声");
    }
    public void performAction() {
        System.out.println(name + "展示调用方法");
        makeSound();    //调用方法
    }
    public String getName(){
        return name;
    }
}

class Cat extends Animal{
    public Cat(String Name){    //构造一个局部变量
        super(Name);    //传递到父类
    }
    protected void makeSound(){
        System.out.println(name + "喵喵喵");
    }
    public void climb(){
        System.out.println(name + "：猫会上树");
        makeSound();
    }
}

class Dog extends Animal{
    public Dog(String Name){
        super(Name);
    }
    protected void makeSound(){
        System.out.println(name +"汪汪汪");
    }
    public void swim(){
        System.out.println(name + ":狗会狗刨");
        makeSound();
    }
}

public class AnimalTest {
    static void main(String[] args) {   //直接使用子类
        Cat cat1=new Cat("小猫发财");
        Dog dog1=new Dog("小狗旺财");
        System.out.println("猫名："+cat1.name);
        System.out.println("狗名：" + dog1.name);

        //调用方法,输出声音,向上转型
        cat1.performAction();
        dog1.performAction();

        Animal animal1=new Cat("小猫八方");
        Animal animal2=new Dog("小狗花花");

        animal1.performAction();
        animal2.performAction();
    }
}