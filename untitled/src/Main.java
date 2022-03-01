import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.Trees;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la operacion o escriba SALIR.");
        System.out.print("Exoresion = ");
        String Express = sc.nextLine();
        while (!Express.equals("SALIR")){
            try {
                CharStream input = CharStreams.fromString(Express);
                EBNFLexer lexer = new EBNFLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                EBNFParser parser = new EBNFParser(tokens);
                ParseTree tree = parser.prules(); // se hace el arbol
                System.out.println("Arbol de la expresion: " + tree.toStringTree(parser));
                PrefixCalcu ans = new PrefixCalcu();
                System.out.println("Resultado: " + ans.evaluar(Express));
                System.out.println("Inserta la expresion o escriba SALIR.");
                System.out.print("Exoresion = ");
                Express = sc.nextLine();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("expression no valida");
                return;
            }
        };
        sc.close();
    }

}
