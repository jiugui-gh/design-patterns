package chapter1.demo3.plan1;

public interface IUserManager {
    // 一个方法一个职责
    void changeUserName(String newUserName);
    
    void changeHomeAddress(String newHomeAddress);
}
