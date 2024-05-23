package dipendenti;

public class DipendentePartTime extends Dipendente {
    int orelavorate;


    public DipendentePartTime(Dipartimento dipartimento, double stipendio) {
        super(dipartimento, stipendio);


    }

    public void setOrelavorate(int orelavorate) {
        this.orelavorate = orelavorate;
    }

    @Override
    public double calculateSalary() {

        return this.orelavorate * this.getStipendio();
    }


}
