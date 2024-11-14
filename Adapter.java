abstract class Apple {
    public abstract void charge();
}
class Iphone {
    Apple apple;
    Iphone(Apple apple){
        this.apple=apple;
    }
    public void chargePhone()
    {
        apple.charge();
    }
}
abstract class Android {
    public abstract void charging();
}
class AndroidCharger extends Android{
    @Override
    public void charging() {
        System.out.println("cahrging using android");
    }
}
class AdapterFun extends Apple{
    Android android;
    AdapterFun(Android android){
        this.android=android;
    }
    @Override
    public void charge() {
        System.out.println("Adapter using");
        android.charging();
    }
}

public class Adapter {


    public static void main(String[] args) {
        Apple a=new AdapterFun(new AndroidCharger());
        Iphone iphone=new Iphone(a);
        a.charge();
    }
}