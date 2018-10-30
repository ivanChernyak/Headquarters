package com.ivan.chernyak;

public class Soldier extends Human implements CapableOfFighting{
    private int yearsOfService;
    private double sal;
    private Commander commander;

    public Soldier(String name, int year, int yearsOfService, double sal) {
        super(name, year);
        this.yearsOfService = yearsOfService;
        this.sal = sal;

    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void fight() {
        System.out.println("im soldier " + this.getName() + "ready to fight!");

    }

    @Override
    public void report() {
        System.out.println("im soldier " + this.getName() + " my commander is " + commander);

    }

    public void tellAboutSol(){
        System.out.println("Im soldier!");
        System.out.println("My sal is: " + sal);
    }
}
