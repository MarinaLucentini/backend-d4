package dipendenti;

public class DipendenteFullTime extends Dipendente implements Checked {
    int inizioturno;

    public DipendenteFullTime(Dipartimento dipartimento, double stipendio) {
        super(dipartimento, stipendio);
    }

    public int getInizioturno() {
        return inizioturno;
    }

    public void setInizioturno(int inizioturno) {
        this.inizioturno = inizioturno;
    }

    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }

    @Override
    public void checked() {
        System.out.println("Ho iniziato il turno alle ore" + this.inizioturno);
    }


    ;
}
