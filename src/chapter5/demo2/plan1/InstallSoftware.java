package chapter5.demo2.plan1;

public class InstallSoftware {

    // 耦合关系甜蜜且了   如果要将Wizard返回值改为boolean类型的   那么需要修改的地方很多
    public void installWizard(Wizard wizard) {
        
        int first = wizard.first();
        
        if(first > 50) {
            int second = wizard.second();
            
            if(second > 50) {
                int third = wizard.third();
                if(third > 50) {
                    wizard.first();
                }
            }
        }
    }
}
