package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23, 12, 33, 47};
        int sum = 0;

        for(int num : myNumberArray){
            sum += num;
        }
        double average = (double) sum / myNumberArray.length;
        System.out.println(average);


        MajorLeagueSoccer newTeam = new MajorLeagueSoccer();
        System.out.println(Arrays.toString(newTeam.playerNumberArray));

        System.out.println("---Transferring Player to Minor---");
        newTeam.sendPlayerToMinorLeague(5);
        System.out.println(Arrays.toString(newTeam.playerNumberArray));

        newTeam.sendPlayerToMinorLeague(5);

        System.out.println("---Transferred to a New Team---");
        newTeam.transferPlayerToDifferentTeam(6, "Tottenham");
        newTeam.transferPlayerToDifferentTeam(6, "Tottenham");



    }

}
