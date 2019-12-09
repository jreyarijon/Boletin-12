/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol12_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Josemolamazo
 */
public class Garaxe {

    private int numeroCoches;
    private String matricula;

    public Garaxe() {

    }

    public Garaxe(int nC, String matricula) {
        numeroCoches = nC;
        this.matricula = matricula;
    }

    public void setNumeroCoches(int nC) {
        numeroCoches = nC;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void comprobarSitio() {
        int plazas = 5;
        if (plazas > 0) {
            matricula = JOptionPane.showInputDialog(null, "Teclee nº matricula", "PLAZAS DISPOÑIBLES", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "COMPLETO", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void pago() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee tempo estacionado: ");
        int tempoEstacionamento = sc.nextInt();
        float prezo = 0;
        int horasExtra;

        if (tempoEstacionamento <= 3) {
            prezo = 1.5f;
        } else {
            prezo = prezo + 0.20f;
            System.out.println("Precio a pagar: " + prezo + " €");
        }
        System.out.println("Teclee cantidade recibida: ");
        float cartosRecibidos = sc.nextFloat();
        System.out.println("FACTURA: " + "\nMatricula: " + matricula + "\nTempo: " + tempoEstacionamento + "\nPrecio: " + prezo + "\nCartos recibidos: " + cartosRecibidos + "\nCartos devoltos: " + (cartosRecibidos - prezo) + "\nGRAZAS POR USAR O NOSO APARCADOIRO");

    }
}
