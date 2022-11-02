import java.io.*;

public class Copia {

    public Copia() throws IOException {
        //leitura
        FileInputStream file = new FileInputStream("Loren.txt");
        InputStreamReader isr = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(isr);
        //escrita
        OutputStream file_1 = new FileOutputStream("Test_2.txt");
        Writer isr_1 = new OutputStreamWriter(file_1);
        BufferedWriter bw = new BufferedWriter(isr_1);

        String linha = br.readLine();

        while(linha != null){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
