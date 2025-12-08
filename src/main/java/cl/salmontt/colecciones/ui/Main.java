package cl.salmontt.colecciones.ui;

import cl.salmontt.colecciones.data.GestorUnidades;
import cl.salmontt.colecciones.model.UnidadOperativa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Obtener lista polimórfica
        List<UnidadOperativa> unidades = GestorUnidades.cargarUnidades();

        // Recorrer usando polimorfismo
        for (UnidadOperativa u : unidades) {
            u.mostrarInformacion();   // LLAMADA POLIMÓRFICA
        }
    }
}
