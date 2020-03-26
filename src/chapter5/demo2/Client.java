package chapter5.demo2;

public class Client {

    public static void main(String[] args) {
        InstallSoftware install = new InstallSoftware();
        Wizard wizard = new Wizard();
        install.installWizard(wizard);
    }
}
