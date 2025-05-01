package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();

        sc.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);

        int result = 0;
        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            if (secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = firstNum / secondNum;
            }
        } else {
            System.out.println("유효하지 않은 연산자 입니다!");
        }

        System.out.println("결과: " + result);
    }
}
