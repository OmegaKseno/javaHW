package org.example.hw1;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {

        sumNumbersAfterNegatives();
    }

    /**
     * sumNumbersAfterNegatives - Выводит сумму положительных чисел, после которых следует отрицательное число.
     */
    public static void sumNumbersAfterNegatives (){
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = 0;
        int sum = 0;
        while(first!=0) {
            second = scanner.nextInt();
            if (first>0&&second<0){
              sum+=first;
            }
            first=second  ;
        }
        System.out.println(sum);
    }

}




