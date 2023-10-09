/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticasliga;

/**
 *
 * @author ignac
 */
public class EstadisticasLiga {

    public static void main(String[] args) {
        Temporada temporada=new Temporada("2022", "C:\\Users\\ignac\\Documents\\NetBeansProjects\\EstadisticasLiga\\src\\main\\java\\com\\mycompany\\estadisticasliga\\SP1.csv");
        temporada.imprimir_partidos();
    }
}
