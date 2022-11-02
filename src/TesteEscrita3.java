import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public TesteEscrita3() throws FileNotFoundException {
        PrintStream ps = new PrintStream("Test_4.txt");
        ps.println("MFEIfnerjowngojerng ofnerfngerojngon mefrkgmkermg");
        ps.println();
        ps.println(",cpklermgperphetpm,eg,eŕger  ǵp,leŕ,g ŕeg,erǵ  ");

        ps.close();
    }
}
