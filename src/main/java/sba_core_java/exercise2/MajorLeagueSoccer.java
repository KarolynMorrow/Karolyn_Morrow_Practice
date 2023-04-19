package sba_core_java.exercise2;

import static java.util.Collections.binarySearch;

public class MajorLeagueSoccer {
    int[] playerNumberArray;

    public MajorLeagueSoccer() {
        this.playerNumberArray = new int[11];
        for(int i = 0; i < playerNumberArray.length; i++){
            playerNumberArray[i] = i + 1;
        }
    }

    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }

    public void setPlayerNumberArray(int[] playerNumberArray) {
        this.playerNumberArray = playerNumberArray;
    }

    public void sendPlayerToMinorLeague(int playerID){
        //If playerID is still in playerNumberArray, remove and print
        //else print player unavailable
        int index = playerID - 1;
        int playerIDInArray = playerNumberArray[index];

        for(int i : playerNumberArray){
            if(playerIDInArray != -1){
                playerNumberArray[index] = -1;
                System.out.println("Player " + playerID + " is sent to minor league.");
            } else {
                System.out.println("Player " + playerID + " is no longer available.");
            }
            break;
        }
    }
}
