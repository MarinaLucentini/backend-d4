package dipendenti;

import java.util.Random;

public abstract class Dipendente {
    private int id;
    private double stipendio;
    private Dipartimento dipartimento;


    public Dipendente(Dipartimento dipartimento, double stipendio) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


    public abstract double calculateSalary();

    public void stampaMatricola() {
        System.out.println("Questa è la matricola di ogni dipendente" + this.id);
    }

    public int getId() {
        return id;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    ;
}
