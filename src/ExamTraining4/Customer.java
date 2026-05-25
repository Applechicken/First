package ExamTraining4;

//外部类
public class Customer {
    // 私有属性
    private String customerName;      // 顾客姓名
    private String membershipNumber;  // 会员编号
    private String consumptionLevel;  // 消费等级

    // 外部类构造方法
    public Customer(String customerName, String membershipNumber) {
        this.customerName = customerName;
        this.membershipNumber = membershipNumber;
        this.consumptionLevel = "未评级";
    }

    /**
     * 成员内部类：消费记录类
     */
    public class ConsumeRecord {
        // 私有属性
        private String recordNumber;   // 记录编号
        private double amount;         // 单次消费金额

        // 全参构造方法
        public ConsumeRecord(String recordNumber, double amount) {
            this.recordNumber = recordNumber;
            this.amount = amount;
        }

        /**
         * 判断消费金额是否大于100元并给出消费评级
         */
        public void judgeConsume() {
            if (amount > 100) {
                consumptionLevel = "高级会员";
                System.out.println("消费金额：" + amount + "元，大于100元，消费评级：高级会员");
            } else {
                consumptionLevel = "普通会员";
                System.out.println("消费金额：" + amount + "元，小于等于100元，消费评级：普通会员");
            }
        }

        /**
         * 输出消费记录同时展示所属顾客的姓名、会员编号
         */
        public void showRecordInfo() {
            System.out.println("=== 消费记录详情 ===");
            System.out.println("所属顾客姓名：" + customerName);
            System.out.println("顾客会员编号：" + membershipNumber);
            System.out.println("消费记录编号：" + recordNumber);
            System.out.println("单次消费金额：" + amount + "元");
            System.out.println("当前消费等级：" + consumptionLevel);
            System.out.println("===================");
        }
    }

    // 主方法（测试类）
    public static void main(String[] args) {
        // 1. 创建外部类对象（顾客）
        Customer customer = new Customer("李四", "VIP9527");

        // 2. 使用外部类对象创建内部类对象（消费记录）
        Customer.ConsumeRecord record = customer.new ConsumeRecord("REC2024002", 88.5);

        // 3. 调用方法完成评级判断
        System.out.println("【评级判断】");
        record.judgeConsume();

        System.out.println(); // 空行分隔

        // 4. 调用方法输出消费记录及所属顾客信息
        System.out.println("【信息输出】");
        record.showRecordInfo();

        System.out.println("\n---------- 测试第二种情况（大于100元） ----------\n");

        // 额外测试：消费金额大于100元的情况
        Customer customer2 = new Customer("王五", "VIP12345");
        Customer.ConsumeRecord record2 = customer2.new ConsumeRecord("REC2024003", 299.0);
        record2.judgeConsume();
        record2.showRecordInfo();
    }
}