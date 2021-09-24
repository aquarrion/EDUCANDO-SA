import Gary.*;

import javax.swing.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //item
        Item item = new Item("Rodrigo",5,15,"123gas","123gas",15,15);



        //Solicitud
        Solicitud solicitud = new Solicitud(1500, Calendar.getInstance().getTime(),"gary2014","Papitas",15.5,item);
        System.out.println(solicitud);

        //jefe
        Jefe Gary = new Jefe("Gary","Av. German",548712,17852541);
        System.out.println(Gary);

        //Proveedor
        Proveedor Juan = new Proveedor("Juan","Av. germaint",54649,521654);
        System.out.println(Juan);

        //Director
        DirectorFinanciero pepe = new DirectorFinanciero("adrian","av  haenke",565449,32464654);
        System.out.println(pepe);

        //empleado
        Empleado rodrigo = new Empleado("rodrigo","av bush",546546,5464987);
        System.out.println(rodrigo);

        //factura
        Factura factura = new Factura(15,"haiza",Calendar.getInstance().getTime(),Juan);

        //entrada
        EntradaAlmacen entradaAlmacen = new EntradaAlmacen(15,Calendar.getInstance().getTime(),Juan,25,item,factura);
        System.out.println(entradaAlmacen);

        //salida

        SalidaAlmacen salidaAlmacen = new SalidaAlmacen(54,Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),item,rodrigo);
        System.out.println(salidaAlmacen);




    }
}
