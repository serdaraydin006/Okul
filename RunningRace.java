public class RunningRace {
    private String[] contestantNamesArray;
    private final int[] timeMinutesArray;
    public RunningRace(String[] contestantNames, int[] timeMinutes) {
        this.contestantNamesArray = contestantNames;
        this.timeMinutesArray = timeMinutes;
    }
    public String[] getContestantNamesArray() {
        return contestantNamesArray;
    }
    public void setContestantNamesArray(String[] contestantNamesArray) {
        this.contestantNamesArray = contestantNamesArray;
    }
    public void processRanking(){
        System.out.println("Birinci: " + getFirstCandidateName() + " " + getFirstCandidateMinute() + "'");
        System.out.println("İkinci: " + getSecondCandidateName() + " " + getSecondCandidateTime() + "'");
        System.out.println("Üçüncü: " + getThirdContestantName() + " " + getThirdContestantTime() + "'");
        System.out.println(getClassification());
    }
    public String getClassification(){
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 0; i < timeMinutesArray.length; i++) {
            int  minutes = timeMinutesArray[i];
            if (200 <= minutes && minutes <= 299){
                A++;
            }else if (300 <=minutes && minutes <= 399){
                B++;
            }else if (400 <= minutes){
                C++;
            }
        }
        return "A -> " + A + "\nB -> "+ B + "\nC -> " + C;
    }
    public int getFirstCandidateMinute() {
        int leastMinute = timeMinutesArray[0];
        for (int i = 1; i < timeMinutesArray.length; i++) {
            if (timeMinutesArray[i] < leastMinute) {
                leastMinute = timeMinutesArray[i];
            }
        }
        return leastMinute;
    }
    public String getFirstCandidateName() {
        int leastMinutes = timeMinutesArray[0];
        String leastMinutesName = contestantNamesArray[0];
        for (int i = 1; i < timeMinutesArray.length; i++) {
            if (leastMinutes > timeMinutesArray[i]) {
                leastMinutes = timeMinutesArray[i];
                leastMinutesName = contestantNamesArray[i];
            }
        }
        return leastMinutesName;
    }
    public int getSecondCandidateTime() {
        int firstMinute = getFirstCandidateMinute();
        int secondMinute = timeMinutesArray[0];
        for (int i = 1; i < timeMinutesArray.length; i++) {
            int currentMinute = timeMinutesArray[i];
            if (firstMinute < currentMinute && secondMinute > currentMinute) {
                secondMinute = currentMinute;
            }
        }
        return secondMinute;
    }
    public String getSecondCandidateName(){
        int firstMinute = getFirstCandidateMinute();
        int secondMinute = timeMinutesArray[0];
        String secondContestant = "";
        for (int i = 0; i < timeMinutesArray.length; i++) {
            int currentMinute = timeMinutesArray[i];
            if (firstMinute < currentMinute && secondMinute > currentMinute){
                secondMinute = currentMinute;
                secondContestant = contestantNamesArray[i];
            }
        }
        return secondContestant;
    }
    public int getThirdContestantTime(){
        int firstMinute = getFirstCandidateMinute();
        int secondMinute = getSecondCandidateTime();
        int thirdMinute = timeMinutesArray[0];
        for (int i = 0; i < timeMinutesArray.length; i++) {
            int currentMinute = timeMinutesArray[i];
            if (secondMinute < currentMinute && thirdMinute > currentMinute){
                thirdMinute = currentMinute;
            }
        }
        return thirdMinute;
    }
    public String getThirdContestantName(){
        int thirdMinutes = getThirdContestantTime();
        String thirdContestant = "";
        for (int i = 0; i < timeMinutesArray.length; i++) {
            if (timeMinutesArray[i] == thirdMinutes){
                thirdContestant = contestantNamesArray[i];
                return thirdContestant;
            }
        }
        return thirdContestant;
    }
}