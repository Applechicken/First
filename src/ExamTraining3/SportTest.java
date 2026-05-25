package ExamTraining3;

abstract class Sport{
    public abstract void start();   //开展运动
}

interface Benefit{
    void getBenefit();  //运动益处
}

class Run extends Sport implements Benefit{
        //重写方法
    public void start(){
        System.out.println("开展一项球类运动");
    }
    public void getBenefit(){
        System.out.println("运动帮助我们锻炼身体");
    }
}
//测试类
public class SportTest {
    static void main(String[] args) {
        Run run=new Run();   //Run:一个自己定义的变量,run:一个自己定义的变量,Run():Run表示类,()表示无参
        System.out.println("运动的内容");
        run.start();
        run.getBenefit();
    }
}
