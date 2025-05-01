package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public int calculate(int firstNum, int secondNum, char operator) {
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
                return -1;
            } else {
                result = firstNum / secondNum;
            }
        } else {
            System.out.println("유효하지 않은 연산자 입니다!");
            return -1;
        }
        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResults() {
        if (results.size() > 0) {
            results.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    public int getResultCount() {
        return results.size();
    }
}
