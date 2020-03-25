package chapter1.demo1.plan1;


public class Plan1Test {

    
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        
        IUserBO userBO = (IUserBO)userInfo;
        userBO.setPassword("123456");
        
        IUserBiz userBiz = (IUserBiz)userInfo;
        userBiz.addOrg(userBO, 1);
    }
}
