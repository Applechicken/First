package HomeWork4;

import java.io.*;
import java.util.Scanner;

public class FileWork{
    public static void main(String[] args) throws Exception {
        File file = new File("user.txt");
        if (!file.exists()) {
            FileWriter fw = new FileWriter(file);
            fw.write("admin,123456");
            fw.close();
            System.out.println("默认账号已创建：admin / 123456");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("用户名: ");
        String name = sc.nextLine();
        System.out.print("密码: ");
        String pwd = sc.nextLine();
        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        String line = br.readLine();
        br.close();

        if (line.equals(name + "," + pwd)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        sc.close();
    }
}