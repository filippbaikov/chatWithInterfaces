package RepositoryPack;

import java.io.File;

public interface RepositoryView {
    File createFile(String path);
    void fileAppendText(File file, String text);
    String readFromFileByRow(File file);
    String readFromFile(File file);
}
