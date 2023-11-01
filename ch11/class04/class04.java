package class04;

interface Mymath{
    public void show();
    public void add(int x, int y);
    public void sub(int x, int y);
    public void mul(int x, int y);
    public void div(int x, int y);
}
class Compute implements Mymath{
    private int ans;
    public void add(int x, int y){
        ans = x + y;
    }
    public void mul(int x, int y){
        ans = x * y;
    }
    public void div(int x, int y){
        ans = x / y;
    }
    public void sub(int x, int y){
        ans = x - y;
    }
    public void show(){
        System.out.println(ans);
    }
}

public class class04 {
    public static void main(String[] args) {
        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show();
    }
}
