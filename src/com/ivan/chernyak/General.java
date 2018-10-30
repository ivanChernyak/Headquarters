package com.ivan.chernyak;

public class General extends Human implements CapableOfFighting {
    private String dept;
    private Commander[] commanders = new Commander[2];

    public General(String name, int year, String dept) {
        super(name, year);
        this.dept = dept;

    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Commander[] getCommanders() {
        return commanders;
    }

    public void setCommanders(Commander[] commanders) {
        this.commanders = commanders;
    }

    @Override
    public void fight() {
        System.out.println("im general " + this.getName() + "ready to fight!");
    }

    @Override
    public void report() {
        System.out.println("im general " + this.getName() + " my commanders is \n");
        for (Commander c : commanders) {
            System.out.println(c.getName());
        }
    }

    public void tellAboutGen(){
        System.out.println("Im general. My dept is " + dept);
    }
}
