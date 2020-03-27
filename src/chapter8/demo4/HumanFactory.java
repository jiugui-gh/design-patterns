package chapter8.demo4;

public class HumanFactory  {

    @SuppressWarnings("unchecked")
    public  static<T extends Human> T createHuman(Class<T> type) {
        // TODO Auto-generated method stub
        // 定义一个生产的人种
        Human human = null;
        
        try {
           
            human = (T)Class.forName(type.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("人种生产错误！");
        }
        return (T) human;
    }

}
