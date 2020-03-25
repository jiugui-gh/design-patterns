package chapter2.demo2;

public class Snipper {

    public void killEnemy(AUG aug) {
        // 先观察敌人
        aug.zoomOut();
        // 然后再射击
        aug.shoot();
    }
    
    public static void main(String[] args) {
        // 这样子直接使用Rifle的子类作为参数  直接调用子类
        Snipper snipper = new Snipper();
        snipper.killEnemy(new AUG());
        
        // 显然这样子不行  父类不能强转为子类
        Snipper sanMao = new Snipper();
        sanMao.killEnemy((AUG)(new Rifle()));
        
        
        /**
         * 有子类出现的地方，父类未必就能出现
         */
    }
}
