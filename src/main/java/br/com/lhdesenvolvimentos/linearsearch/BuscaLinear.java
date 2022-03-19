package br.com.lhdesenvolvimentos.linearsearch;

import java.util.Scanner;

import br.com.lhdesenvolvimentos.utils.Print;

/**
 * BuscaLinear
 */
public class BuscaLinear {
    
    private Scanner scan = new Scanner(System.in);
    private String[] states = new String[] {
        "AC",
        "BA",
        "CE",
        "DF",
        "AM",
        "AP",
        "PB",
        "RN",
        "MA",
        "GO",
    };

    public void start() {
        Print.newLine("\n-> Busca Linear");

        for (String st : states) {
            Print.newLine("-> " + st);
        }

        Print.onLine("\n-> Digite o estado que você quer procurar: ");
        String stateSelected = scan.nextLine();
        checkIfStateExists(stateSelected);
    }

    public boolean checkIfStateExists(String state) {
        String stateFound = "";

        for (String st : states) {
            if(st.trim().toLowerCase().equals(state.toLowerCase().trim())) {
                stateFound = state;
                break;
            }
        }
        if(stateFound.equals(state)) {
            Print.newLine("O Estado foi encontrado!");
            return true;
        } else {
            Print.newLine("O Estado não foi encontrado!");
            return false;
        }
    }
}