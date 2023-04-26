package Model;

public interface ICalculoDeCostosDeServicios {

    /** los servicios adicionales de almacenamiento, recoleccion y seguimiento avanzado seran clases que
     * no se crearan (Por ahora). Utilizamos la interfaz para calcular los costos base y adicionales que se implementaran
     * eventualmente.
     */

    /** prototipado de metodos que eventualmente se podran usar en otras clases**/

    public  double calcularTarifaBase();

    public double calcularTarifaAdicional();

}
