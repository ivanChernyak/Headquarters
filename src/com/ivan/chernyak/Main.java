package com.ivan.chernyak;

public class Main {
    public static void main(String[] args) {
        int solNum = 5;
        int commNum = 2;

        Soldier[] soldiersFirst = new Soldier[solNum];
        Soldier[] soldiersSecond = new Soldier[solNum];

        for (int i = 0; i<solNum; i++){
            soldiersFirst[i] = new Soldier("solName1-" +i, i+1, i+2, (i+1)*10);
            soldiersSecond[i] = new Soldier("solName2-" +i, i+1, i+2, (i+1)*10);
        }

        Commander[] commanders = new Commander[commNum];

        for (int i = 0; i<commNum; i++){
            commanders[i] = new Commander("commName" +i,i+1, "rank"+i, i+2);
        }

        General general = new General("genName", 52, "genDept");

        general.setCommanders(commanders);

        commanders[0].setSoldiers(soldiersFirst);
        commanders[1].setSoldiers(soldiersSecond);
        commanders[0].setGeneral(general);
        commanders[1].setGeneral(general);

        for (int i = 0; i<solNum; i++){
          soldiersFirst[i].setCommander(commanders[0]);
          soldiersSecond[i].setCommander(commanders[1]);
        }
    }
}
