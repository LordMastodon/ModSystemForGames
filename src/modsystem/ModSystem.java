package modsystem;

import modsystem.util.Mod;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

public class ModSystem {

    static File desktop = new File(System.getProperty("user.home"), "Desktop");
    static File modDir = new File(desktop, "/Mod Folder");
    static File exampleMod = new File(modDir, "Example Mod.edmod");

    public static void main(String[] args) {
        if(!modDir.exists()) {
            modDir.mkdir();
        } else {
            System.out.println("Mod Directory Already Exists");
        }

        if(!exampleMod.exists()) {
            try {
                exampleMod.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            try {
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                //mkyong.com/java/how-to-create-xml-file-in-java-dom/
                //mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
            } catch (ParserConfigu)
        } else {
            System.out.println("Example Mod Exists");
        }

        Mod[] mods = checkForMods();
    }

    public static Mod[] checkForMods() {
        return null;
    }

}
