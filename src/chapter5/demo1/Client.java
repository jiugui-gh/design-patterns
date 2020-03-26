package chapter5.demo1;

public class Client {

    public static void main(String[] args) {
        
        Teacher teacher = new Teacher();
        GroupLeader leader = new GroupLeader();
        teacher.command(leader);
    }
}
