/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Fundamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Digite o total de Kw/h consumido no mes: ");

        int totalKwh = leitor.nextInt();

        JOptionPane.showMessageDialog(null, """
                                            Selecione a bandeira atribuida
                                             1- azul
                                             2-amarela
                                             3-vermelha """);
        // String bandeira = leitor.next()

        // switch(bandeira){
        //     case 1:
        // }

        System.exit(0);
    }

}
