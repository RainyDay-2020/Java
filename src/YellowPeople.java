/**
 * @Author JWJ
 * @Date 2020/9/12 10:43
 * @Version 1.0
 * @Description:
 */

public class YellowPeople implements People{
    public void highLq(){
        System.out.println("姜文静智商超高");
    }
    @Override
    public void eat() {
        System.out.println("姜文静吃肉，吴子强吃辣椒");
    }

    @Override
    public void run() {
        System.out.println("姜文静跑的快，吴子强跑的慢");
    }

    @Override
    public void speak() {
        System.out.println("汉语");
    }

    @Override
    public void getFood() {
        System.out.println("自己动手丰衣足食");
    }

    @Override
    public void color() {
        System.out.println("肤色：黄皮肤，健康色");
    }
}
