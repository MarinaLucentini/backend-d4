import dipendenti.*;

public class Main {
 /*   public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente2 = new Dipendente(Dipartimento.VENDITE);
        Dipendente dipendente3 = new Dipendente(Dipartimento.PRODUZIONE);
        Dipendente arrayDipendenti[] = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            arrayDipendenti[i].stampaMatricola();
        }

    }*/

    public static void main(String[] args) {


        DipendenteFullTime dipendente1 = new DipendenteFullTime(Dipartimento.PRODUZIONE, 1500.00);
        DipendentePartTime dipendente2 = new DipendentePartTime(Dipartimento.VENDITE, 10.00);
        Dirigente dipendente3 = new Dirigente(Dipartimento.AMMINISTRAZIONE, 2500);
        dipendente2.setOrelavorate(400);
        Dipendente arraydipendenti[] = {dipendente1, dipendente2, dipendente3};
        double sum = 0;
        for (int i = 0; i < arraydipendenti.length; i++) {
            Dipendente currentdipendente = arraydipendenti[i];
            if (currentdipendente instanceof DipendenteFullTime) {
                sum += currentdipendente.calculateSalary();
            } else if (currentdipendente instanceof DipendentePartTime) {
                sum += currentdipendente.calculateSalary();

            } else {
                sum += currentdipendente.calculateSalary();
            }
        }
        System.out.println(sum);
    }
}