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
        System.out.println("Media de goles que mete el equipo local: "+
                temporada.media_goles_equipos_locales());
        System.out.println("Media de goles que mete el Betis como local: "+
                temporada.media_goles_equipos_locales("Betis"));
        System.out.println("Media de goles que mete el Betis como visitante: "+
                temporada.media_goles_equipos_visitantes("Betis"));
    }
}
