package Server;

import Client.ClientGUI;
import Client.ClientView;
import RepositoryPack.RepositoryView;

public class Server {
    private RepositoryView repositoryView;
    private static ClientView clientView;

    public Server(RepositoryView repositoryView, ClientView clientView) {
        this.repositoryView=repositoryView;
        this.clientView=clientView;
    }




    public String serverAnswer() {
        return repositoryView.readFromFileByRow(repositoryView.createFile("src/RepositoryPack/history"));
    }
    public String readFromFile(){
        return repositoryView.readFromFile(repositoryView.createFile("src/RepositoryPack/history"));
    }


    public void appendTextFromClient(String text) {
        repositoryView.fileAppendText(repositoryView.createFile("src/RepositoryPack/history"),text+"\n");

    }
    public  void addClient(){
       clientView.createNewClient();

           }
       }



