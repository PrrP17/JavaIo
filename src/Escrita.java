import java.io.*;

public class Escrita {
    public Escrita() throws IOException {
        OutputStream file_1 = new FileOutputStream("Test.txt");
        Writer isr_1 = new OutputStreamWriter(file_1);
        BufferedWriter bw = new BufferedWriter(isr_1);

        bw.write("Wernvon n fringon on greigmnpŕmgpimrqkgnmk ng mngrejngjnerjgn");
        bw.newLine();


        bw.close();
    }
}
