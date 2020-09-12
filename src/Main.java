/**
 * @Author JWJ
 * @Date 2020/9/12 10:44
 * @Version 1.0
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        //BlackPeople,YellowPeople;WhitePeople;

        People p1 = new YellowPeople();
        p1.color();
        p1.eat();
        p1.getFood();
        p1.run();
        p1.speak();
        ((YellowPeople)p1).highLq();

        People p2 = new BlackPeople();
        p2.color();
        p2.eat();
        p2.getFood();
        p2.run();
        p2.speak();
        ((BlackPeople)p2).rap();

        People p3 = new WhitePeople();
        p3.color();
        p3.eat();
        p3.getFood();
        p3.run();
        p3.speak();
        ((WhitePeople)p3).bigMouse();



    }

}
