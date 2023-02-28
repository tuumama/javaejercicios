
import java.text.*;
import java.util.*;

public class calendario {

    public static void main(String[] args) {
        printCalendar(2022, 4);
    }

    static void printCalendar(int year, int nCols) {
        if (nCols < 1 || nCols > 12)
            throw new IllegalArgumentException("Numero de columnas incorrecto!!");
        Calendar date = new GregorianCalendar(year, 0, 1);
        int nRows = (int) Math.ceil(12.0 / nCols);
        int offs = date.get(Calendar.DAY_OF_WEEK) - 2;
        int w = nCols * 24;
        String[] monthNames = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        String[][] mons = new String[12][8];
        for (int m = 0; m < 12; m++) {
            String name = monthNames[m];
            int len = 11 + name.length() / 2;
            String format = MessageFormat.format("%{0}s%{1}s", len, 21 - len);
            mons[m][0] = String.format(format, name, "");
            mons[m][1] = " Lu Ma Mi Ju Vi Sa Do";
            int dim = date.getActualMaximum(Calendar.DAY_OF_MONTH);
            for (int d = 1; d < 43; d++) {
                boolean isDay = d > offs && d <= offs + dim;
                String entry = isDay ? String.format(" %2s", d - offs) : "   ";
                if (d % 7 == 1)
                    mons[m][2 + (d - 1) / 7] = entry;
                else
                    mons[m][2 + (d - 1) / 7] += entry;
            }
            offs = (offs + dim) % 7;
            date.add(Calendar.MONTH, 1);
        }
        System.out.printf("%" + (w / 2 + 10) + "s%n", "[[ Calendario ]]");
        System.out.printf("%" + (w / 2 + 4) + "s%n%n", year);
        for (int r = 0; r < nRows; r++) {
            for (int i = 0; i < 8; i++) {
                for (int c = r * nCols; c < (r + 1) * nCols && c < 12; c++)
                    System.out.printf("   %s", mons[c][i]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
