package BT.BT02;

import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello Java!";

        System.out.println("Ứng dụng kiểm tra chuỗi có khớp với chuỗi cho sẵn hay không: ");
        System.out.println("Bạn hãy nhập ký tự để kiểm tra: ");
        String input = sc.nextLine();

        if(str.equals(input)) {
            System.out.println("Ký tự nhập vào trùng khớp!");
            return;
        }

        System.out.println("Ký tự nhập vào là không trùng khớp!");
    }
}
