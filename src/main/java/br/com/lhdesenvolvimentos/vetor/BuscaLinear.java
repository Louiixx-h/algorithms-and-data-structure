package br.com.lhdesenvolvimentos.vetor;

import java.util.Scanner;

/**
 * BuscaLinear
 */
public class BuscaLinear {
    
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
    private Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("\n-> Busca Linear");

        for (String st : states) {
            System.out.println("-> " + st);
        }

        System.out.println("\n-> Digite o estado que você quer procurar:");
        String stateSelected = scan.nextLine();
        buscaLinear(stateSelected);
    }

    private void buscaLinear(String state) {
        String stateFound = "";
        for (String st : states) {
            if(st.trim().toLowerCase().equals(state.toLowerCase().trim())) {
                stateFound = state;
                break;
            }
        }
        if(stateFound.equals(state)) {
            System.out.println("O Estado foi encontrado!");
        } else {
            System.out.println("O Estado não foi encontrado!");
        }
    }
}