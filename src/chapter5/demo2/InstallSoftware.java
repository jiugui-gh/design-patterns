package chapter5.demo2;

public class InstallSoftware {

    // 耦合关系甜蜜且了   如果要将Wizard返回值改为boolean类型的   那么需要修改的地方很多
    public void installWizard(Wizard wizard) {
        wizard.install();
        
    }
}
