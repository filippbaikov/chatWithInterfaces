package Client;

public class Client implements ClientView{
    @Override
    public void createNewClient() {
        ClientGUI clientGUI=new ClientGUI();
        clientGUI.setVisible(true);
    }
}
