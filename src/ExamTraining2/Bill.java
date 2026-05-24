package ExamTraining2;

public class Bill {
    private String userNo;      // 用户编号
    private double waterAmount; // 用水量（吨）
    private double elecAmount;  // 用电量（度）
    private double waterPrice;  // 水费单价（元/吨）
    private double elecPrice;   // 电费单价（元/度）

    // 无参构造
    public Bill() {
    }
    // 有参构造
    public Bill(String userNo, double waterAmount, double elecAmount,
                double waterPrice, double elecPrice) {
        this.userNo = userNo;
        this.waterAmount = waterAmount;
        this.elecAmount = elecAmount;
        this.waterPrice = waterPrice;
        this.elecPrice = elecPrice;
    }
    public double countBill() {
        double waterCost = waterAmount * waterPrice;
        double elecCost = elecAmount * elecPrice;
        return waterCost + elecCost;
    }

    public void showBill() {
        double waterCost = waterAmount * waterPrice;
        double elecCost = elecAmount * elecPrice;
        double total = countBill();

        System.out.println("用户编号：" + userNo);
        System.out.println("用水量：" + waterAmount + " 吨");
        System.out.println("水费单价：" + waterPrice + " 元/吨");
        System.out.println("水费小计：" + waterCost + " 元");
        System.out.println("用电量：" + elecAmount + " 度");
        System.out.println("电费单价：" + elecPrice + " 元/度");
        System.out.println("电费小计：" + elecCost + " 元");
        System.out.println("总费用：" + total + " 元");

    }

}
class BillTest {
    public static void main(String[] args) {
        Bill bill = new Bill("10001", 15.5, 200, 3.5, 0.6);
        bill.showBill();
        System.out.println("\n单独调用countBill()：" + bill.countBill() + " 元");
    }
}