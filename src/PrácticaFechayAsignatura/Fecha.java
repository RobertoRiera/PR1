package PrácticaFechayAsignatura;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Fecha {

    private GregorianCalendar calendar = new GregorianCalendar();

    public Fecha(int dia, int mes, int año) throws Exception {
        calendar.set(año, mes, dia);
        if (compruebaFecha(dia, mes, año) == false) {
            throw new Exception("Fecha mal introducida");
        }
    }

    public boolean compruebaFecha(int dia, int mes, int año) {
        boolean fechaCorrecta = true;

        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                fechaCorrecta = false;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            if (dia < 1 || dia > 30) {

                fechaCorrecta = false;
            }
        }
        if (mes == 2) {

            if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {

                if (dia < 1 || dia > 29) {

                    fechaCorrecta = false;
                }

            } else {

                if (dia < 1 || dia > 28) {

                    fechaCorrecta = false;
                }
            }
        }
        return fechaCorrecta;
    }

    public void añadeDias(int d) throws Exception {
        calendar.add(Calendar.DAY_OF_MONTH, d);
        if (d < 0 || d > 30) {
            throw new Exception("Error en el número de días");
        }
    }
}