package seriesLoading;

import java.util.Random;

public class YupanquiNiurkaL10 {

    public void SerieaLoadingL10() {
        Random random = new Random();
        int fileSize = 10 + random.nextInt(91); 

        int downloaded = 0;
        int barLength = 30;

        System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%d kB)\n", fileSize);

        for (int i = 0; i <= fileSize; i++) {
            downloaded++;

    
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            
            int progress = (int) ((double) downloaded / fileSize * barLength);

            
            StringBuilder bar = new StringBuilder();
            bar.append("━".repeat(progress));
            bar.append(" ".repeat(barLength - progress));

            
            System.out.printf("\r%s %.1f / %d kB", bar, (double) downloaded, fileSize);
        }
        System.out.println("\nDownload completado.");
    }
}

