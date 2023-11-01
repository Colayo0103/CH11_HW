package class07;

interface MyMath {
    void show();
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
}

interface AdvancedMath {
    public void mod(int a, int b);
    public void fac(int a); 
    public void pow(int a, int b); 
}

class Compute implements MyMath, AdvancedMath {
    private int ans;

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;

    }

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        ans = factorial;
    }

    public void pow(int a, int b) {
        ans = (int) Math.pow(a, b);
    }

    public void show() {
        System.out.println(ans);
    }
}

public class class07 {
    public static void main(String args[]) {
        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show(); 
        cp.mod(14, 5);
        cp.show(); 
        cp.fac(5);
        cp.show();
    }
}