import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita {


    public TesteEscrita() throws IOException {
        FileWriter fw = new FileWriter("Test_3.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("lemrkmgkermgçerçg mregerçlgmçermgm grmgçmerçmgmçkrgm");
        bw.newLine();
        bw.newLine();
        bw.write("fregergergergerg gregergergergerger");

        fw.close();

    }
}
