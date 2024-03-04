public class RunningRaceTest {
    public static void main(String[] args) {
        int [] timeMinutesArray = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        String [] contestantNamesArray = {"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        RunningRace myRunningRace = new RunningRace(contestantNamesArray, timeMinutesArray);
        myRunningRace.processRanking();
    }
}
