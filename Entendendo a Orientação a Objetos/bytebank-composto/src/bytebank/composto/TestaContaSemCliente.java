/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.composto;

/**
 *
 * @author user
 */
public class TestaContaSemCliente { 
    public static void main(String[] args) { 
        Conta contaDaMarcela = new Conta(); 
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome); 
    }
}   

