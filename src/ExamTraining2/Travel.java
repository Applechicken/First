package ExamTraining2;

public class Travel {
    private String startPlace;   // 出发地
    private String destination;  // 目的地
    private double distance;     // 行驶里程（公里）
    private double pricePerKm;   // 每公里单价（元/公里）

    // 无参构造
    public Travel() {
    }

    // 有参构造
    public Travel(String startPlace, String destination, double distance, double pricePerKm) {
        this.startPlace = startPlace;
        this.destination = destination;
        this.distance = distance;
        this.pricePerKm = pricePerKm;
    }

    public double getCost() {
        return distance * pricePerKm;
    }

    public void showTravelInfo() {
        double cost = getCost();

        System.out.println("出发地：" + startPlace);
        System.out.println("目的地：" + destination);
        System.out.println("行驶里程：" + distance + " 公里");
        System.out.println("每公里单价：" + pricePerKm + " 元");
        System.out.println("总费用：" + cost + " 元");
    }
}
class TravelTest {
    public static void main(String[] args) {
        // 创建对象（使用有参构造）
        Travel travel = new Travel("北京", "上海", 1200, 0.5);

        // 展示出行信息和费用
        travel.showTravelInfo();

        // 也可以单独获取费用
        System.out.println("\n单独调用getCost()：" + travel.getCost() + " 元");
    }
}