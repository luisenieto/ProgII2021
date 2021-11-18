/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import interfaces.IGestorEspacios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author root
 */
public class GestorEspacios implements IGestorEspacios {
    private List<Espacio> espacios = new ArrayList<>();
    private static GestorEspacios instancia;
    
    public static final String NOMBRE_ARCHIVO = "Espacios.txt";
    private static final char SEPARADOR = ','; 
    //caracter usado para separar los atributos de un espacio

    
    private GestorEspacios() {
        String resultado = this.leerArchivo();
    }
    
    public static GestorEspacios crear() {
        if (instancia == null)
            instancia = new GestorEspacios();
        return instancia;
    }

    @Override
    public String nuevoEspacio(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        if(!this.espacios.contains(e)) {
            this.espacios.add(e);
            String resultado = this.escribirArchivo();
            return (resultado.equals(ESCRITURA_OK) ? OK : resultado);
        }
        else
            return REPETIDO;
    }

    @Override
    public void mostrarEspacios() {
        Collections.sort(this.espacios);
        for(Espacio e : this.espacios)
            e.mostrar();
    }

    @Override
    public void mostrarEspacios(Comparator<Espacio> cmp) {
//        Collections.sort(this.espacios, cmp);
        this.espacios.sort(cmp);
        for(Espacio e : this.espacios)
            e.mostrar();
    }
    
    
    

    public static void main(String[] args) {
//        pruebaEscritura1("A1", 300, Tipo.ANFITEATRO);
//        pruebaLectura1();
//        pruebaLectura2();

//        pruebaEscritura2("A1", 300, Tipo.ANFITEATRO);
//        pruebaLectura1();
//        pruebaLectura2();

//        pruebaEscritura3("A1", 300, Tipo.ANFITEATRO);
//        pruebaLectura1();
//        pruebaLectura2();
//        pruebaLectura3();
        
//        pruebaEscritura4("A1", 300, Tipo.ANFITEATRO);
//        pruebaEscritura4("1-3-14", 60, Tipo.AULA);
//        pruebaLectura3();

        IGestorEspacios ge = GestorEspacios.crear();
//        ge.nuevoEspacio("A1", 300, Tipo.ANFITEATRO);
//        ge.nuevoEspacio("1-3-14", 60, Tipo.AULA);
//        ge.nuevoEspacio("1-3-8", 80, Tipo.LABORATORIO);
        
        ge.mostrarEspacios();

    }
    
    /**
     * Lee del archivo de texto y carga el ArrayList empleando un try con recursos
     * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
     * Formato del archivo:
     *  nombre1,capacidad1,tipo1
     *  nombre2,capacidad2,tipo2
     *  ...
     *  nombreN,capacidadN,tipoN
     * @return String  - cadena con el resultado de la operacion (LECTURA_OK | LECTURA_ERROR | CREACION_ERROR)
     */    
    private String leerArchivo() {
/*        Sin emplear de try con recursos         */        

//        File file = this.obtenerArchivo();
//        if (file != null) {
//            try {
//                FileReader fr = new FileReader(file);
//                BufferedReader br = new BufferedReader(fr);
//                String cadena;
//                try {
//                    while((cadena = br.readLine()) != null) {
//                        String[] vectorEspacios = cadena.split(Character.toString(SEPARADOR));
//                        String nombre = vectorEspacios[0];
//                        int capacidad = Integer.parseInt(vectorEspacios[1]);
//                        Tipo tipo = Tipo.verTipo(vectorEspacios[2]);
//
//                        Espacio e = new Espacio(nombre, capacidad, tipo);
//                        this.espacios.add(e);
//                    }
//                    br.close();
//                    return LECTURA_OK;                    
//                }
//                catch(IOException e) {
//                    try {
//                        br.close();
//                        return LECTURA_ERROR;
//                    }
//                    catch(IOException e1) {
//                        return LECTURA_ERROR;
//                    }
//                }
//            }
//            catch(FileNotFoundException e) {
//                return LECTURA_ERROR;
//            }            
//        }
//        else
//            return CREACION_ERROR;

/*        Empleo de try con recursos         */

        File file = this.obtenerArchivo();
        if (file != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String cadena;
                while((cadena = br.readLine()) != null) {
                    String[] vectorEspacios = cadena.split(Character.toString(SEPARADOR));
                    String nombre = vectorEspacios[0];
                    int capacidad = Integer.parseInt(vectorEspacios[1]);
                    Tipo tipo = Tipo.verTipo(vectorEspacios[2]);

                    Espacio e = new Espacio(nombre, capacidad, tipo);
                    this.espacios.add(e);
                }
                return LECTURA_OK;
            }
            catch(NullPointerException | IOException ioe) {
                return LECTURA_ERROR;
            }            
        }
        else
            return CREACION_ERROR;        
    }        
    
    /**
     * Obtiene el objeto File, y si no puede devuelve null
     * @return File  - objeto file correspondiente a un determinado nombre y ubicación
     */
    private File obtenerArchivo() { 
        File file = new File(NOMBRE_ARCHIVO);
        try {
            if (!file.exists())
                file.createNewFile();
            return file;
        }
        catch(IOException e) {
            return null;            
        }        
    }

    /**
     * Escribe en el archivo de texto empleando un try con recursos
     * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
     * Formato del archivo:
     *  nombre1,capacidad1,tipo1
     *  nombre2,capacidad2,tipo2
     *  ...
     *  nombreN,capacidadN,tipoN
     * @return String  - cadena con el resultado de la operacion (ESCRITURA_OK | ESCRITURA_ERROR | CREACION_ERROR)
     */
    private String escribirArchivo() {
        File file = this.obtenerArchivo();
        if (file != null) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {     
                for(Espacio e : this.espacios) {
                    String cadena = e.getNombre();
                    cadena += SEPARADOR + Integer.toString(e.getCapacidad());
                    cadena += SEPARADOR + e.getTipo().toString();
                    bw.write(cadena); 
                    bw.newLine();
                }            
                return ESCRITURA_OK;
            } 
            catch (IOException ioe) {
                return ESCRITURA_ERROR;            
            }
        }
        else
            return CREACION_ERROR;        
    }
    
    public static void pruebaEscritura1(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        try {
            FileWriter fw = new FileWriter(NOMBRE_ARCHIVO);
            fw.write(e.getNombre());
            fw.write(e.getCapacidad()); //capacidad es un int
            fw.write(e.getTipo().toString());
            fw.write("\n");
            fw.close();
        }
        catch(IOException e1) {
            
        }
        
    }
    
    public static void pruebaEscritura2(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        try {
            FileWriter fw = new FileWriter(NOMBRE_ARCHIVO);
            fw.write(e.getNombre());
            fw.write(Integer.toString(e.getCapacidad()));
            fw.write(e.getTipo().toString());
            fw.write("\n");
            fw.close();
        }
        catch(IOException e1) {
            
        }
        
    }
    
    public static void pruebaEscritura3(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        try {
            FileWriter fw = new FileWriter(NOMBRE_ARCHIVO);
            fw.write(e.getNombre());
            fw.write(Character.toString(SEPARADOR));
            fw.write(Integer.toString(e.getCapacidad()));
            fw.write(Character.toString(SEPARADOR));
            fw.write(e.getTipo().toString());
            fw.append("\n");
            fw.close();
        }
        catch(IOException e1) {
            
        }
        
    }
    
    public static void pruebaEscritura4(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        try {
            FileWriter fw = new FileWriter(NOMBRE_ARCHIVO, true);
            fw.write(e.getNombre());
            fw.write(Character.toString(SEPARADOR));
            fw.write(Integer.toString(e.getCapacidad()));
            fw.write(Character.toString(SEPARADOR));
            fw.write(e.getTipo().toString());
            fw.write("\n");
            fw.close();
        }
        catch(IOException e1) {
            
        }
        
    }
    
    public static void pruebaLectura1() {
        try {
            FileReader fr = new FileReader(NOMBRE_ARCHIVO);
            int caracter;
            while((caracter = fr.read()) != -1) {
                System.out.print(caracter);
            }
            fr.close();
                
        }
        catch(IOException e) {
            
        }
    }
    
    public static void pruebaLectura2() {
        try {
            FileReader fr = new FileReader(NOMBRE_ARCHIVO);
            int numero;
            char caracter;
            while((numero = fr.read()) != -1) {
                caracter = (char)numero;
                System.out.print(caracter);
            }
            fr.close();
                
        }
        catch(IOException e) {
            
        }
    }
    
    public static void pruebaLectura3() {
        try {
            FileReader fr = new FileReader(NOMBRE_ARCHIVO);
            int numero;
            char caracter;
            StringBuilder cadena = new StringBuilder();
            while((numero = fr.read()) != -1) {
                if (numero == 10) { // \n
                    Espacio e = obtenerEspacio(cadena.toString());
                    e.mostrar();
                    cadena = new StringBuilder();
                }
                else {
                    caracter = (char)numero;
                    cadena.append(caracter);
                }                
            }
            fr.close();
        }
        catch(IOException e) {
            
        }
    }
    
    public static Espacio obtenerEspacio(String cadena) {        
        String[] vectorEspacios = cadena.split(Character.toString(SEPARADOR));
        String nombre = vectorEspacios[0];
        int capacidad = Integer.parseInt(vectorEspacios[1]);
        Tipo tipo = Tipo.verTipo(vectorEspacios[2]);
        return new Espacio(nombre, capacidad, tipo);
    }
}
