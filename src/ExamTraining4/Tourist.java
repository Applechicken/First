package ExamTraining4;

public class Tourist {      //游客
    private String touristName;    //姓名
    private long idNum;   //身份证号
    private String destination;    //目的地

    //外部类构造方法
    public Tourist(String touristName, long idNum, String destination) {
        this.touristName = touristName;
        this.idNum = idNum;
        this.destination = destination;
    }

    //定义内部类
    public class TravelRegard {  //出行纪录类
        private String regardId;    //记录编号
        private int day;    //出行天数

        //全参构造
        public TravelRegard(String regardId, int day) {
            this.regardId = regardId;
            this.day = day;
        }

        //修改出行天数
        public void updateDay(int time) {
            if (time < 0) {
                System.out.println("不能添加负数");
            } else {
                day += time;
                System.out.println("增加天数：" + time + "天,当前总天数：" + day + "天");
            }
        }

        //判断是否为长途出行,>=3天为长途
        public void judgeLongTravel() {
            if (day >= 3) {
                System.out.println("是长途出行," + day + "天");
            } else {
                System.out.println("不是长途出行," + day + "<3天");
            }
        }

        public void showTravel() {
            System.out.println("======游客信息======");
            System.out.println("姓名：" + touristName);
            System.out.println("身份证号：" + idNum);
            System.out.println("目的地：" + destination);
            System.out.println("出行时间:" + day + "天");
            if (day >= 3) {
                System.out.println("是长途旅行");
            } else {
                System.out.println("不是长途旅行，差" + (3 - day) + "天");
            }
            System.out.println("====================");
        }
    }


static void main(String[] args) {
        // 1. 创建外部类对象
        Tourist tourist = new Tourist("张三", 12344, "沈阳");
        // 2. 使用外部类对象创建内部类对象
        Tourist.TravelRegard regard = tourist.new TravelRegard("E203224", 2);
        // 3. 展示初始信息
        System.out.println("[初始信息]");
        regard.showTravel();
        System.out.println();
        // 4. 判断是否达标
        System.out.println("【时长判断】");
        regard.judgeLongTravel();

        System.out.println();

        // 5. 增加天数
        System.out.println("【增加天数】");
        regard.updateDay(1);   // 增加8节，共23节，达标
        regard.updateDay(-5);  // 测试负数，应报错

        System.out.println();

        // 6. 再次判断达标情况
        System.out.println("【再次达标判断】");
        regard.judgeLongTravel();

        System.out.println();

        // 7. 最终信息展示
        System.out.println("【最终信息】");
        regard.showTravel();

    }
}