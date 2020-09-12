/**
 * @Author JWJ
 * @Date 2020/9/12 10:31
 * @Version 1.0
 * @Description:
 */

public class BlackPeople implements People {
    public void rap(){
        System.out.println("rap: 一块钱only四个窝窝头");
    }
    @Override
    public void eat() {
        System.out.println("黑人爱吃荞麦面包，肤色健康");
    }

    @Override
    public void run() {
        System.out.println("黑人跑得快");
    }

    @Override
    public void speak() {
        System.out.println("黑人 say hello");
    }

    @Override
    public void getFood() {
        System.out.println("从超市拿了好多食物");
    }

    @Override
    public void color() {
        System.out.println("肤色：黑色");
    }
}
