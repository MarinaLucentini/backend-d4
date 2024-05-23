import dipendenti.Dipartimento;
import dipendenti.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new Dipendente(Dipartimento.VENDITE);
        Dipendente dipendente3 = new Dipendente(Dipartimento.PRODUZIONE);
        Dipendente arrayDipendenti[] = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            arrayDipendenti[i].stampaMatricola();
        }

    }


}