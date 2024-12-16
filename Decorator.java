interface  Burger
{
    public String details();
    public int price();
}
class Ginjer implements Burger
{
    @Override
    public String details() {
        return "gjinjer Burher";
    }

    @Override
    public int price() {
        return 150;
    }
}
class Hamburger implements Burger
{
    @Override
    public String details() {
        return "Hamburger Burger";
    }

    @Override
    public int price() {
        return 200;
    }
}
abstract class BurgerDecorator implements Burger
{

}
class ExtraChess extends BurgerDecorator
{
    Burger burger;
    ExtraChess(Burger burger)
    {
        this.burger = burger;
    }

    @Override
    public String details() {
        return   burger.details()+" Extra chess";
    }

    @Override
    public int price() {
        return burger.price()+100;
    }
}
public class Decorator {
    public static void main(String[] args) {
        Burger burger = new Ginjer();
        BurgerDecorator burgerDecorator = new ExtraChess(burger);
        System.out.println( burgerDecorator.details());
        System.out.println( burgerDecorator.price());
    }
}
