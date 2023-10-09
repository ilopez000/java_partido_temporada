/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticasliga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Temporada {
    
    private ArrayList<Partido> partidos=new ArrayList<>();
    private String year;
    private String fichero_datos;
    
    public Temporada(String year_, String fichero_datos_){
        this.year=year_;
        this.fichero_datos=fichero_datos_;
        cargar_datos();
    }
    
    //meter dentro de partidos, todos los partidos de 
    //la temporada que leamos en el fichero_datos
    private void cargar_datos(){
        ArrayList<String[]> datos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fichero_datos))) {
            String linea;
            br.readLine(); //cabecera que no procesamos
            while ((linea = br.readLine()) != null) {
                // Suponiendo que las comas son los separadores de los datos
                // y no están dentro de los campos del CSV
                String[] campos = linea.split(",");
                datos.add(campos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //ya tenemos todos los datos del fichero -excepto cabecera-
        //en la variable datos. Recorremos el ArrayList y para cada
        //posición del ArrayList instanciamos un partido
        for(int i=0; i<datos.size(); i++){
            Partido p=new Partido(datos.get(i)[1],
                                  datos.get(i)[3], 
                                  datos.get(i)[4],
                                  Integer.parseInt(datos.get(i)[5]),
                                  Integer.parseInt(datos.get(i)[6]),
                                  Integer.parseInt(datos.get(i)[8]),
                                  Integer.parseInt(datos.get(i)[9]),
                                  Integer.parseInt(datos.get(i)[11]),
                                  Integer.parseInt(datos.get(i)[12]),
                                  Integer.parseInt(datos.get(i)[17]),
                                  Integer.parseInt(datos.get(i)[18])
                                );
            p.imprimir_datos_partido();
            partidos.add(p);
        }
    }
    
        //imprime los datos por consola de todos los partidos
        public void imprimir_partidos(){
            for(int i=0; i<partidos.size(); i++){
                partidos.get(i).imprimir_datos_partido();
            }
        }
        
}
    

