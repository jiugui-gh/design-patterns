package chapter1.demo3;

import chapter1.demo1.IUserBO;

public interface IUserManager {
    // 方法职责不清晰 ， 不要让别人猜测这个方法具体是干什么的
    void changeUser(IUserBO userBO,String... changeOptions);
}
