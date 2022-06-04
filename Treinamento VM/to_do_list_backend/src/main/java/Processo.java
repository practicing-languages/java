import java.util.Calendar;
import java.util.Date;

public class Processo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "liso",
                "Rafael",
                "coelho",
                new Date(2001, Calendar.OCTOBER,31)
        );

        Musico musico = new Musico("liso",
                "Rafael",
                "coelho",
                new Date(2001, Calendar.OCTOBER,31),
                "violao"
        );
        System.out.println(musico);
        System.out.println(pessoa);
    }
}
