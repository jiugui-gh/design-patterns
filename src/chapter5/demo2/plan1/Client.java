package chapter5.demo2.plan1;

public class Client {

    public static void main(String[] args) {
        InstallSoftware install = new InstallSoftware();
        Wizard wizard = new Wizard();
        install.installWizard(wizard);
    }
}
