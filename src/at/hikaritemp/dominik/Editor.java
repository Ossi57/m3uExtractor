package at.hikaritemp.dominik;

import java.util.ArrayList;

public class Editor {

    public Editor(){
    }

    public ArrayList<String> editList(ArrayList<String> list){
        int i = 1;
        ArrayList<String> newList = new ArrayList<String>();
        newList.add(list.get(0));
        while(list.get(i) != null){
            if(list.get(i).contains("group-title=\"TURKEY") || list.get(i).contains("group-title=\"GERMANY")){
                newList.add(list.get(i));
                newList.add(list.get(i + 1));
            }
            i += 2;
        }
        System.out.println("Liste erfolgreich bearbeitet");
        return newList;
    }
}
