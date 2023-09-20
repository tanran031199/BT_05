package BT.BT03;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi muốn đảo ngược: ");
        StringBuffer str = new StringBuffer(sc.nextLine());

        System.out.println("Chuỗi của bạn sau khi được đảo ngược là: " + str.reverse());
    }
}
