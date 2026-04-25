package HomeWork2;

import java.util.Vector;

interface Vehicle{
    void transport();
}
abstract class Nonmotive implements Vehicle{

}
abstract class Automotive implements Vehicle{
    class Engine{   //机动车引擎
        private double dischargeCapacity;
        public Engine(double dischargeCapacity1){
            this.dischargeCapacity=dischargeCapacity1;
        }

        public void start(){
            System.out.println("汽车启动");
        }

        public void stop(){
            System.out.println("汽车停止");
        }

        public void reverse(){
            System.out.println("倒车");
        }
    }
}

class Bicycle extends Nonmotive{
    public void transport(){
        System.out.println("骑自行车");
    }
}

class Car extends Automotive{
   private Engine engine;
   public Car(double dischargeCapacity){
       engine= new Engine(dischargeCapacity);
   }
   public void transport(){
       System.out.println("正在启动");
       engine.start();
       System.out.println("正在行驶");
       engine.stop();
       engine.reverse();
   }
}
public class Main{
    static void main(String[] args) {
        Vehicle car =new Car(2.0);
        Vehicle bicycle=new Bicycle();
        car.transport();
        bicycle.transport();

        }
    }




