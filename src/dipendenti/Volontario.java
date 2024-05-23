package dipendenti;

public class Volontario extends Dipendente implements Checked {
    private String name;
    private int age;
    private String Cv;
    private int inizioservizio;

    public Volontario(Dipartimento dipartimento, double stipendio) {
        super(dipartimento, stipendio);
    }

    public int getInizioservizio() {
        return inizioservizio;
    }

    public void setInizioservizio(int inizioservizio) {
        this.inizioservizio = inizioservizio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCv() {
        return Cv;
    }

    public void setCv(String cv) {
        Cv = cv;
    }

    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }

    @Override
    public void checked() {
        System.out.println("Ciao sono" + this.name + "ho" + this.age + "ho iniziato il servizio alle ore" + this.inizioservizio);
    }
}
