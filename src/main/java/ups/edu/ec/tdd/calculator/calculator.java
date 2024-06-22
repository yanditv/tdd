package ups.edu.ec.tdd.calculator;

public class calculator {

    private int ans;
    public int addition(int a, int b) {
        return a+b;
    }
    public int substraction(int a, int b) {
        return a-b;
    }
    public int division(int a, int b) {
        return a/b;
    }
    public int multiplication(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a*b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
