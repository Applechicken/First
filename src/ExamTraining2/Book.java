package ExamTraining2;

public class Book {
    private String BookName;
    private String author;
    private float price;
    private int BuyNum;
    //无参构造
    public Book(){
    }
    //有参构造
    public Book(String BookName,String author,float price,int BuyNum){
        this.BookName=BookName;
        this.author=author;
        this.price=price;
        this.BuyNum=BuyNum;
    }
    //创建自定义方法,计算书籍总价
    public double getTotalPrice(){
        return this.price * this.BuyNum;
    }
    //输出书籍全部信息及总价
    public void showInfo(){
        System.out.println("书籍名称：" + BookName);
        System.out.println("书籍作者：" + author);
        System.out.println("书籍单价：" + price);
        System.out.println("贩卖数量：" + BuyNum);
        System.out.println("书籍总价：" + getTotalPrice());
    }
}

class BookTest{
   public static void main(String[] args) {
        Book book=new Book("JAVA程序设计","冯艳红", 15.0F,986);
        book.showInfo();
    }
}








