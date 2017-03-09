package com.framgia.java;

/**
 * Created by framgia on 09/03/2017.
 */
public class DecisionMaking {
    public static void main(String[] args) {
        /*
        Cho 1 oos nguyeen n nguyên nhập vào từ bàn phím
        0 < n <13
        In ra mùa của tháng hiện tại
         */
        int n = -1;
        if (n >= 1 && n <= 3) {
            System.out.println("Mùa xuân");
        } else if (n >= 4 && n <= 6) {
            System.out.println("Mùa hạ");
        } else if (n >= 7 && n <= 9) {
            System.out.println("Mùa thu");
        } else if (n >= 10 && n <= 12) {
            System.out.println("Mùa đông");
        } else {
            System.out.println("Không phải mùa trong năm");
        }
        switch (n) {
            case 1:
            case 2:
            case 3:
                System.out.println("Mùa xuân");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Mùa hạ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Mùa thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Mùa đông");
                break;
            default:
                System.out.println("Không phải mùa trong năm");
                break;
        }


    }
}
