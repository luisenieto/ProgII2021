package espacios.modelos;

import java.util.HashMap;
import java.util.Map;

public enum Tipo {
    LABORATORIO("Laboratorio"),
    AULA("Aula"),
    ANFITEATRO("Anfiteatro");
    
    private String valor;
    
    /**
     * Constructor
     * @param valor valor de la enumeración
     */                
    private Tipo(String valor) {
        this.valor = valor;
    }            
    
    /**
     * Devuelve la constante como cadena
     * @return String  - constante como cadena
     */                
    @Override
    public String toString() {
        return this.valor;
    } 
    
    /**
     * Transforma una cadena en el valor de su enumeración correspondiente
     * @param tipo cadena que representa un tipo
     * @return Tipo  - enumeración Tipo
     */
    public static Tipo verTipo(String tipo) {
        Map<String, Tipo> map = new HashMap<>();
        for (Tipo t : Tipo.values()) {
            map.put(t.toString(), t);
        }
        return map.get(tipo);
    }
}
