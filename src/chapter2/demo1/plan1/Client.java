package chapter2.demo1.plan1;

/**
 * 
 * 如果要添加玩具枪，那么肯定不能直接继承AbstractGun,因为玩具枪不能shoot不能给士兵杀人
 * 如果要在Soldier中进行instanceof 的判断，那么每增加一个枪械类就需要修改所有关于枪械类的代码
 * 解决方法就是将玩具枪脱离继承独立建立父类
 * @author Pinkboy
 *
 */
public class Client {

    public static void main(String[] args) {
        Soldier sanMao = new Soldier();
        
        Rifle rifle = new Rifle();
        
        sanMao.setGun(rifle);
        
        sanMao.killEnemy();
    }
}
