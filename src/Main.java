import calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            int result = calculator.calculate(firstNum, secondNum, operator);

            System.out.println("결과: " + result);

            System.out.println("저장된 모든 결과: " + calculator.getResults());

            if (calculator.getResultCount() > 0) {
                System.out.print("가장 오래된 결과를 삭제하시겠습니까? (y/n): ");
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    calculator.removeResults();
                }
                System.out.println("삭제 후 저장된 결과: " + calculator.getResults());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.nextLine().equals("exit")) {
                break;
            }
        }
    }
}