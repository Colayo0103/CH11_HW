package class01;
abstract class Caaa{
    protected int num;
    public Caaa(int n){
        this.num = n;
    }
    public abstract void show();
}
class Cbbb extends Caaa{
    public Cbbb(int n){
        super(n);
    }
    public void show(){
        System.out.println(num);
    }
}
public class class01 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2);
        bb.show();
    }    
}