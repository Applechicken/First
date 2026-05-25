package ExamTraining3;

abstract class Machine{
    public abstract void start();   //设备启动
}

interface Attribute{
    void getArr();      //获取设备属性
}

class Printer extends Machine implements Attribute{
    public void start(){
        System.out.println("设备用电启动");
    }

    public void getArr(){
        System.out.println("设备产地德国，总花费1000000元");
    }
}


public class MachineTest {
    static void main(String[] args) {
         Printer printer=new Printer();
        System.out.println("机械信息");
        printer.start();
        printer.getArr();
    }
}
