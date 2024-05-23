import dipendenti.*;

public class Main {


    public static void main(String[] args) {


        DipendenteFullTime dipendente1 = new DipendenteFullTime(Dipartimento.PRODUZIONE, 1500.00);
        DipendentePartTime dipendente2 = new DipendentePartTime(Dipartimento.VENDITE, 10.00);
        Dirigente dipendente3 = new Dirigente(Dipartimento.AMMINISTRAZIONE, 2500);
        dipendente2.setOrelavorate(400);
        dipendente1.setInizioturno(15);
        dipendente2.setInizioturno(8);
        Volontario volontario = new Volontario(Dipartimento.PRODUZIONE, 0);
        volontario.setName("Giovanni");
        volontario.setAge(20);
        volontario.setCv("Cv");
        volontario.setInizioservizio(10);
        Dipendente arraydipendenti[] = {dipendente1, dipendente2, dipendente3};
        double sum = 0;
        for (Dipendente currentdipendente : arraydipendenti) {
            if (currentdipendente instanceof DipendenteFullTime) {
                sum += currentdipendente.calculateSalary();
            } else if (currentdipendente instanceof DipendentePartTime) {
                sum += currentdipendente.calculateSalary();

            } else {
                sum += currentdipendente.calculateSalary();
            }
            currentdipendente.stampaMatricola();
        }
        System.out.println(sum);
        Checked[] arraychecked = {dipendente1, dipendente2, volontario};
        for (Checked checkedcurrent : arraychecked) {
            checkedcurrent.checked();
        }
    }
}