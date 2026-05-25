package ExamTraining4;

public class Teacher {
    private String teacherName;   // 教师姓名
    private String jobNumber;     // 工号
    private String subject;       // 授课科目

    // 外部类构造方法
    public Teacher(String teacherName, String jobNumber, String subject) {
        this.teacherName = teacherName;
        this.jobNumber = jobNumber;
        this.subject = subject;
    }

    // 成员内部类：授课记录类
    public class ClassRecord {
        private String recordID;    // 记录ID
        private int courseHour;     // 授课课时（改为int类型，方便计算）

        // 全参构造方法
        public ClassRecord(String recordID, int courseHour) {
            this.recordID = recordID;
            this.courseHour = courseHour;
        }

        // 增加课时（课时不可为负数）
        public void addClassHour(int hours) {
            if (hours < 0) {
                System.out.println("错误：增加的课时不能为负数！");
            } else {
                courseHour += hours;
                System.out.println("增加课时 " + hours + " 节，当前总课时：" + courseHour + " 节");
            }
        }

        // 判断课时是否达标（达标条件：课时 ≥ 20）
        public void checkClassHour() {
            if (courseHour >= 20) {
                System.out.println("课时达标：" + courseHour + " 节 ≥ 20 节，达标！");
            } else {
                System.out.println("课时不达标：" + courseHour + " 节 < 20 节，差 " + (20 - courseHour) + " 节达标");
            }
        }

        // 关联展示教师信息与授课记录
        public void showClassInfo() {
            System.out.println("===== 教师授课记录 =====");
            System.out.println("教师姓名：" + teacherName);
            System.out.println("工号：" + jobNumber);
            System.out.println("授课科目：" + subject);
            System.out.println("记录ID：" + recordID);
            System.out.println("授课课时：" + courseHour + " 节");
            // 显示达标状态
            if (courseHour >= 20) {
                System.out.println("达标状态：达标");
            } else {
                System.out.println("达标状态：不达标（差 " + (20 - courseHour) + " 节）");
            }
            System.out.println("======================");
        }
    }

    // 测试类 main 方法
    public static void main(String[] args) {
        // 1. 创建外部类对象（教师）
        Teacher teacher = new Teacher("张三", "T2024001", "Java程序设计");

        // 2. 使用外部类对象创建内部类对象（授课记录）
        Teacher.ClassRecord record = teacher.new ClassRecord("REC001", 15);

        // 3. 展示初始信息
        System.out.println("【初始信息】");
        record.showClassInfo();

        System.out.println();

        // 4. 判断是否达标
        System.out.println("【达标判断】");
        record.checkClassHour();

        System.out.println();

        // 5. 增加课时（测试正数和负数）
        System.out.println("【增加课时】");
        record.addClassHour(8);   // 增加8节，共23节，达标
        record.addClassHour(-3);  // 测试负数，应报错

        System.out.println();

        // 6. 再次判断达标情况
        System.out.println("【再次达标判断】");
        record.checkClassHour();

        System.out.println();

        // 7. 最终信息展示
        System.out.println("【最终信息】");
        record.showClassInfo();
    }
}