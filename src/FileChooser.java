import java.io.*;

import javax.swing.JFileChooser;
public class FileChooser {
    public static File MakeFileChooser(){
        JFileChooser chooser=new JFileChooser();
        
        int option=chooser.showOpenDialog(null);
        if (option==JFileChooser.APPROVE_OPTION){
            File file=(File) chooser.getSelectedFile();
            return file;
        }
        return null;

    }
   
}
