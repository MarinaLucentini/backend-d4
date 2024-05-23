package dipendenti;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento, double stipendio) {
        super(dipartimento, stipendio);
    }


    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }

}
