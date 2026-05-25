package ExamTraining3;

abstract class StudyBase{
    public abstract void learn();       //学习
}

interface Ability{
    void showAbility();     //展示能力
}

class Programmer extends StudyBase implements Ability{
    //重写方法
    public void learn(){
        System.out.println("程序员需要不断学习新的知识来跟进时代");
    }

    public void showAbility(){
        System.out.println("需要精通各种java，数据库的知识点");
    }
}

public class StudyBaseTest {
    static void main(String[] args) {
        System.out.println("程序员基本");
        Programmer programmer=new Programmer();
        programmer.learn();
        programmer.showAbility();
    }
}
