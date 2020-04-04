package chapter1.demo1;

public interface IUserBO {

    void setUserId(String userId);
    
    String getUserId();
    
    void setPassword(String password);
    
    String getPassword();
    
    void setUserName(String name);
    
    String getUserName();
    
    // 这上面的方法都是用户属性相关的方法
    // 这下面的方法都是用户行为相关的方法
    // 用户属性和用户行为的方法都写在同一个接口里面,两者并没有区分开
    
    boolean changePassword(String password);
    
    boolean deleteUser();
    
    void mapUser();
    
    boolean addOrg1(int orgId);

    boolean addRole(int roleId);
    
    
}
