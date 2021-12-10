import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.CharStream;
import java.util.*;

public class Main {
    public static boolean hasMistakes = false;
    public static void main(String[] args) throws Exception {

        CharStream in = CharStreams.fromFileName(args[0]);
        CmmLexer lexer = new CmmLexer(in) {
            @Override
            public void notifyListeners(LexerNoViableAltException e) {
                // TODO1: if the input is not lex element
                // e.g. the input is "?" , the text is also "?"
                Main.hasMistakes = true;
                int line = this._tokenStartLine;
                String text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()));
                text = text.trim();
                System.err.println("Error type A at Line " + line + ": " + text + ".");
            }
        };
        // TODO2: if the input is lex element
        List<? extends Token> tokenList = lexer.getAllTokens();
        if(hasMistakes == false) {
            for (int i = 0; i < tokenList.size(); i++) {
                int temp = tokenList.get(i).getType();
                String type = CmmLexer.VOCABULARY.getSymbolicName(temp);
                String value = tokenList.get(i).getText();
                value = value.trim();

                System.err.print(type + " ");
                if ( type.compareTo("INT") == 0){
                    if (value.charAt(0) == '0' && value.length() > 1){
                        long dec_num = 0;
                        if (value.charAt(1) == 'x' || value.charAt(1) == 'X'){
                            dec_num = Long.parseLong(value.substring(2), 16);
                        }else{
                            dec_num = Long.parseLong(value.substring(1), 8);
                        }
                        System.err.print(dec_num + " at Line ");
                    }else{
                        System.err.print(value + " at Line ");
                    }
                }
                else if ( type.compareTo("FLOAT") == 0){
                    double dou_num =  Double.parseDouble(value);
                    String num = String.format("%.6f", dou_num);
                    System.err.print(num + " at Line ");
                }
                else{
                    System.err.print(value + " at Line ");
                }
                System.err.println(tokenList.get(i).getLine() + ".");
            }
        }
    }
}
