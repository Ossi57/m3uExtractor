package at.hikaritemp.dominik;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class M3uReader {

    private URL url;
    private BufferedReader objReader;

    public M3uReader(String url) throws IOException {
        try {
            this.url = new URL(url);
            objReader = new BufferedReader(new InputStreamReader(this.url.openStream()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> giveList(){
        ArrayList<String> list = new ArrayList<>();
        try{
            int i = 0;
            while (list.add(objReader.readLine()) && list.get(i) != null)
                ++i;
            objReader.close();
            System.out.println("Liste erfolgreich geladen");
        }
        catch(Exception e){
            System.out.println("Fehler beim Einlesen");
        }
        return list;
    }


}
