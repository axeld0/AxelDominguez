package Model;

import java.util.Objects;

public class PaqueteAereo extends Paquete{

    /**atributos**/

    private String aerolinea;
    private boolean envioExpress;

    /**constructores**/

    public PaqueteAereo ()
    {
        aerolinea = "";
        envioExpress = false;
    }

    public PaqueteAereo(double peso, String destino, boolean seguroEnvio, boolean entregaEnElMismoDia, String aerolinea, boolean envioExpress)
    {
        super(peso, destino, seguroEnvio, entregaEnElMismoDia);
        this.aerolinea = aerolinea;
        this.envioExpress = envioExpress;
    }

    /**getters**/
    public String getAerolinea() {
        return aerolinea;
    }

    public boolean isEnvioExpress() {
        return envioExpress;
    }

    /**toString**/
    @Override
    public String toString() {
        return   "PaqueteAereo{" + super.toString()+
                "aerolinea='" + aerolinea + '\'' +
                ", envioExpress=" + envioExpress +
                ", Tarifa Base = "+ calcularTarifaBase()+
                ", Tarifa Adicional = "+ calcularTarifaAdicional()+
                ", Total = "+ calcularTotalPaquete()+
                "}\n";
    }

    /**equals**/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaqueteAereo that = (PaqueteAereo) o;
        return envioExpress == that.envioExpress && Objects.equals(aerolinea, that.aerolinea);
    }

    /**sobrecarga de metodos de superclase **/

    @Override
    public double calcularTarifaBase()
    {
        double tarifa = getPeso()*30;  //esto es la base

        if(aerolinea.equals("AA"))  // si se envia por aerolineas argentinas sale mas caro
        {
            tarifa = tarifa *1.5;
        }
        if(envioExpress == true)  // si se hace envio express, se aumenta en 1500p
        {
            tarifa+= 1500;
        }
        return tarifa;
    }

    @Override
    public double calcularTarifaAdicional()
    {
        double tarifaAdicional = 0;

        if(isSeguroEnvio() == true)  //si tiene seguro de envio le agrego 2500p
        {
            tarifaAdicional +=2500;
        }
        if(isEntregaEnElMismoDia()== true)
        {
            tarifaAdicional = tarifaAdicional*1.50;   //si tiene entrega en el mismo dia, se le recarga un 50% porciento
        }
        return  tarifaAdicional;
    }




}
