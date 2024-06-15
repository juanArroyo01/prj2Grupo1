package loadings;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class YupanquiNiurkaL04 {

    public void SerieaLoadingL04() {
        System.out.println("Loading 4: ");

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(() -> {
            for (int var1 = 0; var1 <= 100; ++var1) {
                int var2 = 2 - var1 % 3;
                StringBuilder var3 = new StringBuilder();

                for (int var4 = 0; var4 < var2; ++var4) {
                    var3.append("o");
                }

                var3.append("0");

                for (int var4 = 0; var4 < 2 - var2; ++var4) {
                    var3.append("o");
                }

                System.out.print(var3.toString() + " " + var1 + "%\r");

                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);

        // Wait for the task to complete
        try {
            Thread.sleep(21000); // Adjust the sleep time if necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }

 }






