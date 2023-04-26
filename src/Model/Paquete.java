package Model;

public abstract class Paquete implements ICalculoDeCostosDeServicios {
    private double peso;
    private String destino;

    private boolean seguroEnvio;

    private boolean entregaEnElMismoDia;

    private boolean enviado; //agregado para el BONUS TRACK

    /**constructores**/

    public Paquete()
    {
        peso = 0 ;
        destino = "";
        seguroEnvio = false;
        entregaEnElMismoDia = false;
        enviado = false;
    }

    public Paquete (double peso , String destino, boolean seguroEnvio , boolean entregaEnElMismoDia )
    {
        this.peso = peso;
        this.destino = destino;
        this.seguroEnvio = seguroEnvio;
        this.entregaEnElMismoDia = entregaEnElMismoDia;
    }

    /**toString**/
    @Override
    public String toString() {
        return "Paquete{" +
                "peso=" + peso +
                ", destino='" + destino + '\'' +
                '}';
    }

    /**equals**/
    @Override
    public boolean equals(Object o) {
        boolean equals = false;
        if(o !=null)
        {
            if(o instanceof Paquete)
            {
                Paquete aux = (Paquete) o;
                if(((Paquete) o).peso == aux.peso && ((Paquete) o).destino.equals(aux.destino))
                {
                    equals = true;
                }
            }
        }
        return equals;
    }


    /**
     * getters
     */

    public double getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    public boolean isSeguroEnvio() {
        return seguroEnvio;
    }

    public boolean isEntregaEnElMismoDia() {
        return entregaEnElMismoDia;
    }

    public boolean isEnviado() {
        return enviado;
    }

    /**calculo del total del envio**/
    /** Uso los metodos de la interfaz que son implementadas en cada Clase : calcularTarifaBase y calculaTarifaAdicional**/

    public double calcularTotalPaquete(){
        return calcularTarifaAdicional()+calcularTarifaBase();
    }



    /** ENVIAR PAQUETE */

    public String enviarPaquete()
    {
        String mensaje = "El paquete ya fue enviado, sori.";
        if(isEnviado()== false)  //chequeo que no este enviado
        {
            this.enviado =true;
            mensaje = "Joya, el paquete ya fue enviado.";
        }
        return mensaje;
    }
}
