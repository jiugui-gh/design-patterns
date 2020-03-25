package chapter2.demo1.plan1;

public class Soldier {

    private AbstractGun gun;
    
    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }
    
    public void killEnemy() {
        System.out.println("士兵开始杀人");
        gun.shoot();
    }
}
