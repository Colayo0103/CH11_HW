package class02;

abstract class Mymath{
    protected int ans;
    public void show(){
        System.out.println(ans);
    }
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}
class Compute extends Mymath{
    public void add(int a, int b){
        ans = a + b;
    }
    public void mul(int a, int b){
        ans = a * b;
    }    
    public void div(int a, int b){
        ans = a / b;
    }
    public void sub(int a, int b){
        ans = a - b;
    }
}

public class class02 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        cp.mul(2, 4);
        cp.show();    
    }
}
