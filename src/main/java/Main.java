

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
   /*     if (args.length == 0) {
            args = new String[]{"src/main/testsimple.sc"};
        }
        System.out.println("parsing: " + args[0]);

        CLexer lexer = new CLexer(new ANTLRFileStream(args[0]));
        CParser parser = new CParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        CBaseVisitor visitor = new CBaseVisitor();
        visitor.visit(tree);
        System.out.println(CBaseVisitor.asm);*/
        // Get lexer
        CLexer lexer = new CLexer(
                CharStreams.fromStream(
                        Main.class.getResourceAsStream("test.sc")));
        // Get list of tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass tokens to parser
        CParser parser = new CParser(tokens);

        ParseTree tree = parser.start();
        ParseTreeWalker.DEFAULT.walk(new CBaseListener(), tree);
        System.out.println(CBaseListener.asm);
        try (PrintWriter out = new PrintWriter("assembler.s")) {
            out.println(CBaseListener.asm);
        }
    }
}