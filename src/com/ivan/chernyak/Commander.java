package com.ivan.chernyak;

public class Commander extends Human implements CapableOfFighting {
    private int battles;
    private String rank;
    private Soldier[] soldiers = new Soldier[5];
    private General general;

    public Commander(String name, int year, String rank, int battles) {
        super(name, year);
        this.rank = rank;
        this.battles = battles;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getBattles() {
        return battles;
    }

    public void setBattles(int battles) {
        this.battles = battles;
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers = soldiers;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    @Override
    public void fight() {
        System.out.println("im commander " + this.getName() + "ready to fight!");
    }

    @Override
    public void report() {
        System.out.println("im commander " + this.getName() + " my general is " + general + " my soldiers is \n");
        for (Soldier s: soldiers) {
            System.out.println(s.getName());
        }
    }

    public void tellAboutComm(){
        System.out.println("Im Commander. My rank is " + rank);

    }
}
