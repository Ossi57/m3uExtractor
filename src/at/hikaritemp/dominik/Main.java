package at.hikaritemp.dominik;

import at.ossi57.oguzhan.Manager;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

            Runnable runnable = () -> {

                try {
                    Manager manager = new Manager();
                    manager.Run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };

            Thread thread = new Thread(runnable);
            thread.start();

    }
}

