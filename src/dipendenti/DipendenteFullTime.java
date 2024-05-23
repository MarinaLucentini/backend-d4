package dipendenti;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(Dipartimento dipartimento, double stipendio) {
        super(dipartimento, stipendio);
    }

    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }


    ;
}
