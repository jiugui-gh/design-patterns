package chapter1.demo2.plan1;

/**
 * 通过组合的方式    是一种强耦合的方式
 * @author Pinkboy
 *
 */
public class Phone {

    private DataTransfer dataTransfer;
    
    private ConnectionManager connectionManager;

    public DataTransfer getDataTransfer() {
        return dataTransfer;
    }

    public void setDataTransfer(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    public ConnectionManager getConnectionManager() {
        return connectionManager;
    }

    public void setConnectionManager(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }
    
    
}
