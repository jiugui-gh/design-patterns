package chapter1.demo2.plan1;

public interface IConnectionManager {

    // 拨通电话
    void dial(String phoneNumber);
    
    // 通话完毕
    void hangup();
}
