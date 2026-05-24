package ExamTraining2;

public class Grade {
    private String name;        // 姓名
    private double chinese;     // 语文成绩
    private double math;        // 数学成绩
    private double english;     // 英语成绩

    // 无参构造
    public Grade() {
    }

    // 有参构造
    public Grade(String name, double chinese, double math, double english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public double getAvg() {
        return (chinese + math + english) / 3;
    }

    public void showGrade() {
        double avg = getAvg();

        System.out.println("学生姓名：" + name);
        System.out.println("语文成绩：" + chinese + " 分");
        System.out.println("数学成绩：" + math + " 分");
        System.out.println("英语成绩：" + english + " 分");
        System.out.println("三科平均分：" + avg + " 分");

    }
}
class GradeTest {
    public static void main(String[] args) {

        Grade grade = new Grade("李明", 85.5, 92, 78.5);

        grade.showGrade();

        System.out.println("\n单独调用getAvg()：" + grade.getAvg() + " 分");
    }
}