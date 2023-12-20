package Clases;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Alessandro Rios
 */
public class Calendario {
    
    
    Calendar fecha = new GregorianCalendar();
    //fecha
    String year= Integer.toString(fecha.get(Calendar.YEAR));
    String mes= Integer.toString(fecha.get(Calendar.MONTH));;
    String dia= Integer.toString(fecha.get(Calendar.DATE));;

    public String fechaCompleta = dia+"-"+mes+"-"+year;    
    
    //hora
    String hora= Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto= Integer.toString(fecha.get(Calendar.MINUTE));

    public String horaCompleta= hora+":"+minuto;
    
    
}
