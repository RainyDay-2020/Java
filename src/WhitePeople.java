/**
 * @Author JWJ
 * @Date 2020/9/12 10:37
 * @Version 1.0
 * @Description:
 */

public class WhitePeople implements People{
    public void bigMouse(){
        color();
        System.out.println("白人有大鼻子");
    }
    @Override
    public void eat() {
        System.out.println("白人吃西餐");
    }

    @Override
    public void run() {
        System.out.println("跑的不快");
    }

    @Override
    public void speak() {
        System.out.println("English,France");
    }

    @Override
    public void getFood() {
        System.out.println("汉堡");
    }

    @Override
    public void color() {
        System.out.println("肤色：白色");
    }
}
