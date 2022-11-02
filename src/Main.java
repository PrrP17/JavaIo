import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo
        FileInputStream file = new FileInputStream("Loren.txt");
        InputStreamReader isr = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        Escrita esc = new Escrita();
        Copia pc = new Copia();
        TesteEscrita tc = new TesteEscrita();
        TesteEscrita3 ts = new TesteEscrita3();



        br.close();
    }
}