package Model;

import java.util.Arrays;

public class ListaPaquetes {

    /**atributo: array de paquetes **/
    private Paquete[] listadePaquetes;


    /**constructores**/

    /**(hardcodeado con todas las variaciones de paquete)**/
    public ListaPaquetes()
    {
        listadePaquetes = new Paquete[32];
        listadePaquetes[0] = new PaqueteTerrestre(1, "Miami", false, false, 95, "Auto" );
        listadePaquetes[1] = new PaqueteTerrestre(1, "Las Vegas", false, false, 105, "Auto" );
        listadePaquetes[2] = new PaqueteTerrestre(1, "Orlando", false, false, 95, "Camion" );
        listadePaquetes[3] = new PaqueteTerrestre(1, "Miami", false, false, 105, "Camion" );
        listadePaquetes[4] = new PaqueteTerrestre(1, "Miami", true, false, 95, "Auto" );
        listadePaquetes[5] = new PaqueteTerrestre(1, "Miami", true, false, 105, "Auto" );
        listadePaquetes[6] = new PaqueteTerrestre(1, "Miami", true, false, 95, "Camion" );
        listadePaquetes[7] = new PaqueteTerrestre(1, "Miami", true, false, 105, "Camion" );
        listadePaquetes[8] = new PaqueteTerrestre(1, "Miami", true, true, 95, "Auto" );
        listadePaquetes[9] = new PaqueteTerrestre(1, "Miami", true, true, 105, "Auto" );
        listadePaquetes[10] = new PaqueteTerrestre(1, "Miami", true, true, 95, "Camion" );
        listadePaquetes[11] = new PaqueteTerrestre(1, "Miami", true, true, 105, "Camion" );
        listadePaquetes[12] = new PaqueteTerrestre(1, "Miami", false, true, 95, "Auto" );
        listadePaquetes[13] = new PaqueteTerrestre(1, "Miami", false, true, 105, "Auto" );
        listadePaquetes[14] = new PaqueteTerrestre(1, "Miami", false, true, 95, "Camion" );
        listadePaquetes[15] = new PaqueteTerrestre(1, "Miami", false, true, 105, "Camion" );
        listadePaquetes[16] = new PaqueteAereo(100, "San Clemente del Tuyu", false, false, "AA",false);
        listadePaquetes[17] = new PaqueteAereo(100, "Mar del Plata", false, false, "XX",false);
        listadePaquetes[18] = new PaqueteAereo(100, "San Clemente del Tuyu", false, false, "AA",true);
        listadePaquetes[19] = new PaqueteAereo(100, "Necochea", false, false, "XX",true);
        listadePaquetes[20] = new PaqueteAereo(100, "San Clemente", true, false, "AA",false);
        listadePaquetes[21] = new PaqueteAereo(100, "Necochea", true, false, "XX",false);
        listadePaquetes[22] = new PaqueteAereo(100, "San Clemente del Tuyu", true, false, "AA",true);
        listadePaquetes[23] = new PaqueteAereo(100, "Miramar", true, false, "XX",true);
        listadePaquetes[24] = new PaqueteAereo(100, "Bariloche", false, true, "AA",false);
        listadePaquetes[25] = new PaqueteAereo(100, "San Clemente del Tuyu", false, true, "XX",false);
        listadePaquetes[26] = new PaqueteAereo(100, "San Clemente del Tuyu", false, true, "AA",true);
        listadePaquetes[27] = new PaqueteAereo(100, "San Clemente del Tuyu", false, true, "XX",true);
        listadePaquetes[28] = new PaqueteAereo(100, "San Clemente del Tuyu", false, true, "AA",false);
        listadePaquetes[29] = new PaqueteAereo(100, "San Clemente del Tuyu", true, true, "XX",false);
        listadePaquetes[30] = new PaqueteAereo(100, "San Clemente del Tuyu", true, true, "AA",true);
        listadePaquetes[31] = new PaqueteAereo(100, "San Clemente del Tuyu", true, true, "XX",true);
    }


    @Override
    public String toString() {
        return  "ListaPaquetes{"+ Arrays.toString(listadePaquetes) +'}';
    }

    /**informar la cantidad total de paquetes **/
    /** hago 3 funciones para discriminar por tipo de paquete **/

    public int totalPaquetes()
    {
        int total = 0;
        for(int i = 0 ; i <listadePaquetes.length ; i++)
        {
            total++;
        }
        return total;
    }

    public int totalPaquetesAereos()
    {
        int totalAereos = 0 ;
        for(int i = 0 ; i< listadePaquetes.length ; i++)
        {
            if(listadePaquetes[i] instanceof PaqueteAereo)
            {
                totalAereos++;
            }
        }
        return totalAereos;
    }

    public int totalPaquetesTerrestres()
    {
        int totalTerrestres = 0 ;
        for(int i = 0 ; i< listadePaquetes.length ; i++)
        {
            if(listadePaquetes[i] instanceof PaqueteTerrestre)
            {
                totalTerrestres++;
            }
        }
        return totalTerrestres;
    }



}
