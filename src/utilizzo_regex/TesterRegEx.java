package utilizzo_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesterRegEx {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Login");
        System.out.print("Inserisci il nome utente: ");
        String nomeUtente = kbd.nextLine();

        Pattern patter = Pattern.compile("([a-z]+)[.]([a-z]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patter.matcher(nomeUtente);

        if(matcher.matches()) {
            System.out.println("Nome utente valido");
        }else{
            System.out.println("Nome utente invalido");
        }
    }

}