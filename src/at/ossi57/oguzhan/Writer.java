package at.ossi57.oguzhan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {

    public Writer(ArrayList<String> list, String text) throws IOException {

        try {
            FileWriter wr = new FileWriter(text+"_playlist.m3u");

            for (String str : list) {
                wr.write(str + System.lineSeparator());
            }
            wr.close();
        }catch (Exception e){
            System.out.println("Fehler beim erstellen der Datei");
        }
    }
}
