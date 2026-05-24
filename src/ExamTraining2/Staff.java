package ExamTraining2;

public class Staff {
    private String StaffName;
    private String Job;
    private double wage;    //底薪
    private double bonus;   //绩效

    //无参构造
    public Staff(){
    }

    //有参构造
    public Staff(String StaffName,String Job,double wage,double bonus){
        this.StaffName=StaffName;
        this.Job=Job;
        this.wage=wage;
        this.bonus=bonus;
    }

    public double getSalary(){
        return this.wage+this.bonus;
    }

    public void showBill(){
        System.out.println("员工姓名：" + StaffName);
        System.out.println("员工岗位：" + Job);
        System.out.println("底薪：" + wage);
        System.out.println("绩效：" + bonus);
        System.out.println("实发工资：" + getSalary());
    }
}


class StaffTest{
    public static void main(String[] args) {
        Staff staff=new Staff("张三","后端开发",8000,5000);
        staff.showBill();
    }
}
