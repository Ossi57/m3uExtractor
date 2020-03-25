package at.ossi57.oguzhan;

import at.hikaritemp.dominik.Editor;
import at.hikaritemp.dominik.M3uReader;

import java.io.IOException;


public class Manager {
    public void Run() throws InterruptedException {

        while (true) {
            try {
                M3uReader reader = new M3uReader("link0");
                M3uReader reader1 = new M3uReader("link1");
                Editor editor = new Editor();
                new Writer(editor.editList(reader.giveList()),"Samsung");
                new Writer(editor.editList(reader1.giveList()),"FireTV");
            } catch (IOException e) {
                e.printStackTrace();
            }
            Thread.sleep(43200000);
        }
    }
}
