package GUI;

import Domain.Logica;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Object[] botoes = {"Criar Planilha", "Cancelar"};

        try {
            int escolha = JOptionPane.showOptionDialog(null, "Selecione uma opção.",
                    "DocumentMaker", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);

            Logica.opcoes(escolha);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        entrada.close();
        System.exit(0);
    }
}
