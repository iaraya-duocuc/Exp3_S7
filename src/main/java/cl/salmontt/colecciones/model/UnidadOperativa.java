package cl.salmontt.colecciones.model;

/**
 * clase abstracta que representa una unidad operativa genérica con nombre y comuna.
 *
 */
public abstract class UnidadOperativa {
    private String nombre;
    private String comuna;

    /**
     * Crea una nueva unidad operativa con nombre y comuna.
     *
     * @param nombre Nombre de la unidad.
     * @param comuna Comuna donde se ubica.
     */
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    /* Getters y Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Retorna una representación textual de la unidad operativa.
     *
     * @return Cadena con nombre y comuna.
     */
    @Override
    public String toString() {
        return "Unidad Operativa: " +
                "Nombre : '" + nombre + '\'' +
                ", Comuna : '" + comuna;
    }

    // Metodo polimorfico
    /*public void mostrarInformacion() {
        System.out.println("Unidad Operativa: " +
                "Nombre: '" + nombre + "', Comuna: '" + comuna + "'");
    }*/

    // Metodo abstracto
    public abstract void mostrarInformacion();
}
