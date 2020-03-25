package chapter1.demo2;

/**
 *  这个接口包含了两个职责:1.协议管理dial(),hangup()
 *                      2.数据传输chat();
 *                      而且这两个职责互不影响，那就要考虑拆分成两个接口
 * 协议的改变或者数据传输(电话不仅可以打电话，还可以上网) 都会导致接口的改变，
 * @author Pinkboy
 *
 */
public interface IPhone {

    // 拨通电话
    void dial(String phoneNumber);
    
    // 通话
    void chat(Object o);

    // 通话完毕
    void hangup();
}
