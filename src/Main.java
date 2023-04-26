import Model.ListaPaquetes;
import Model.Paquete;
import Model.PaqueteTerrestre;

public class Main {
    public static void main(String[] args) {

        //crea la lista segun la clase de ListaPaquetes
        ListaPaquetes lista = new ListaPaquetes();

        //cuenta la cantidad de paquetes totales, discriminando la cantidad de paquetes de aire y de tierra.
        System.out.println("la cantidad total de paquetes es de : " +lista.totalPaquetes()+ "( Siendo aereos :"+ lista.totalPaquetesAereos()+ ", y Terrestres :"+ lista.totalPaquetesTerrestres()+ ")");

        //imprime la lista, con todos los datos de cada paquete.
        System.out.println(lista);

        //BONUS TRACK. Creo un paquete de prueba y trato de enviarlo dos veces.
        Paquete paqueteDePrueba = new PaqueteTerrestre(1, "Miami", false, true, 95, "Camion" );
        System.out.println(paqueteDePrueba.enviarPaquete());
        System.out.println(paqueteDePrueba.enviarPaquete());
    }
}