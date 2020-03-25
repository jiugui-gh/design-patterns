package chapter1.demo1.plan1;

// 负责用户的行为
public interface IUserBiz {

    boolean changePassword(IUserBO userBo,String newPassword);
    
    boolean deleteUser(IUserBO userBo);
    
    void mapUser(IUserBO userBo);
    
    boolean addOrg(IUserBO userBo,int orgId);

    boolean addRole(IUserBO userBo,int roleId);
}
