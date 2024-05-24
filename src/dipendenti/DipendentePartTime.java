package dipendenti;

public class DipendentePartTime extends Dipendente implements Checked {
    private int orelavorate;
    private int inizioturno;


    public DipendentePartTime(Dipartimento dipartimento, double stipendio) {
        super(dipartimento, stipendio);
    }

    public int getInizioturno() {
        return inizioturno;
    }

    public void setInizioturno(int inizioturno) {
        this.inizioturno = inizioturno;
    }

    public void setOrelavorate(int orelavorate) {
        this.orelavorate = orelavorate;
    }

    @Override
    public double calculateSalary() {
        return this.orelavorate * this.getStipendio();
    }


    @Override
    public void checked() {
        System.out.println("Ho iniziato il turno alle ore" + this.inizioturno);
    }
}
