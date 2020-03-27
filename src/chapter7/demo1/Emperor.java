package chapter7.demo1;
// 皇帝类
public class Emperor {

    // 通过静态常量(饿汉式) 创建单例对象
    private static final Emperor EMPEROR = new Emperor();
    
    private Emperor() {}
    
    public static Emperor getInstance() {
        return EMPEROR;
    }
    
    //皇帝发话
    public static void say() {
        System.out.println("我就是皇帝某某");
    }
}
