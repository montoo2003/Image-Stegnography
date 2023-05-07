import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class EncryptLSB {

/* * Driver method.

*/

public static void Encrypt (File imageFile, String message) {

String directory = new JFileChooser().getFileSystemView().getDefaultDirectory().toString(); String newImageFileString = directory + "\\export.png"; File newImageFile = new File(newImageFileString);

BufferedImage image;

try {

} catch (IOException e) {

}}}