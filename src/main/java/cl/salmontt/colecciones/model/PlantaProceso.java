package cl.salmontt.colecciones.model;

/**
 * Representa una planta de proceso con capacidad productiva,
 * heredando nombre y comuna desde UnidadOperativa.
 */
public class PlantaProceso extends UnidadOperativa {
    private int capacidadProceso;

    /**
     * Crea una nueva planta de proceso.
     *
     * @param nombre Nombre de la planta.
     * @param comuna Comuna donde se ubica.
     * @param capacidadProceso Capacidad de proceso en unidades definidas.
     */
    public PlantaProceso(String nombre, String comuna, int capacidadProceso){
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    /**
     * Obtiene la capacidad de proceso de la planta.
     *
     * @return Capacidad de proceso.
     */
    public int getCapacidadProceso() {
        return capacidadProceso;
    }

    /**
     * Establece la capacidad de proceso de la planta.
     *
     * @param capacidadProceso Nueva capacidad de proceso.
     */
    public void setCapacidadProceso(int capacidadProceso) {
        this.capacidadProceso = capacidadProceso;
    }

    /**
     * Retorna una representación textual de la planta de proceso.
     *
     * @return Cadena con nombre, comuna y capacidad de proceso.
     */
    @Override
    public String toString() {
        return "Planta Proceso: " +
                "Nombre : '" + getNombre() + '\'' +
                ", Comuna : '" + getComuna() + '\'' +
                ", Capacidad de proceso : " + capacidadProceso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Planta de Proceso: " +
                "Nombre: '" + getNombre() + "', " +
                "Comuna: '" + getComuna() + "', " +
                "Capacidad de proceso: " + capacidadProceso);
    }
}
