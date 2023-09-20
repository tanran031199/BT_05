package BT.BT01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ứng dụng kiểm tra chuỗi rỗng: ");
        System.out.println("Nhập ký tự bát kỳ để thử:");
        String input = sc.nextLine();

        if(input.isEmpty()) {
            System.out.println("Không có ký tự nào. Đây là chuỗi rỗng!!!");
            return;
        }

        System.out.println("Có ký tự được nhập vào. Đăy không phải chuỗi rỗng!!!");
    }

}
