package Model;

import java.util.Objects;

public class PaqueteTerrestre extends Paquete{
    private double distanciaEnvio;

    private String tipoVehiculo;


    /**consrtuctores**/

    public PaqueteTerrestre ()
    {
        distanciaEnvio = 0 ;
        tipoVehiculo = "";
    }

    public PaqueteTerrestre(double peso , String destino , boolean seguroEnvio, boolean entregaEnElMismoDia , double distanciaEnvio, String tipoVehiculo)
    {
        super(peso, destino, seguroEnvio, entregaEnElMismoDia);
        this.distanciaEnvio = distanciaEnvio;
        this.tipoVehiculo = tipoVehiculo;
    }

    /**getters**/
    public double getDistanciaEnvio() {
        return distanciaEnvio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**toString**/

    @Override
    public String toString() {
        return   " PaqueteTerrestre{" + super.toString() +
                "distanciaEnvio=" + distanciaEnvio +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", Tarifa Base = "+ calcularTarifaBase()+
                ", Tarifa Adicional = "+ calcularTarifaAdicional()+
                ", Total = "+ calcularTotalPaquete()+
                "}\n" ;
    }


    /** sobrecarga de metodo equals */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaqueteTerrestre that = (PaqueteTerrestre) o;
        return Double.compare(that.distanciaEnvio, distanciaEnvio) == 0 && Objects.equals(tipoVehiculo, that.tipoVehiculo);
    }


    /**sobrecarga de metodos de superclase **/

    @Override
    public double calcularTarifaBase() {
    double tarifa = getPeso() * 25;
    if(tipoVehiculo.equals("Camion"))
    {
        tarifa = tarifa*1.25;
    }
    if(distanciaEnvio > 100)
    {
        double porcentaje = (distanciaEnvio-100) *5;
        tarifa += (tarifa*porcentaje)/100;
    }
    return tarifa;
    }

    @Override
    public double calcularTarifaAdicional()
    {
        double tarifaAdicional = 0;

        if(isSeguroEnvio() == true)
        {
            tarifaAdicional += 1500;
        }
        if(isEntregaEnElMismoDia() == true)
        {
            tarifaAdicional = tarifaAdicional*1.25;
        }
        return tarifaAdicional;
    }

    /*
    public double calcularTotalPaquete()
    {
        return this.calcularTarifaEnvio()+this.calcularTarifaAdicional();
    }
     */

}
