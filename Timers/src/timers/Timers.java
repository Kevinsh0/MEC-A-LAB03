
package timers;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Kevin
 */
public class Timers {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner in = new Scanner(System.in); 
        int TimeAlarma;
        int segun;
        System.out.println("Ingrese la cantidad de minutos en que sonara la alarma: ");
        TimeAlarma = in.nextInt();
        System.out.println("Ingrese la cantidad de segundos en que sonara la alarma: ");
        segun = in.nextInt();
        System.out.println("Su alarma suena en: " + TimeAlarma + " minutos : " + segun + " segundos" );
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                System.out.println("sonando...");
            }
        };
        timer.schedule(tarea, (TimeAlarma*60000)+(segun*1000), 10*1000);
    }
    
}