package chapter8.demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonFactory {

    // 通过反射方式创建
    private static Singleton singleton;
    
    static {
        try {
            
            Class<?> clazz = Class.forName(Singleton.class.getName());
         // 因为是私有的构造器 所以不能直接newInstance()
         //   singleton = (Singleton) clazz.newInstance();

            Constructor<?> constructor = clazz.getDeclaredConstructor();
            // 设置访问权限
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static Singleton getSingleton() {
        return singleton;
    }
    
    public static void main(String[] args) {
        Singleton singleton2 = SingletonFactory.getSingleton();
        System.out.println(singleton2);
    }
}
