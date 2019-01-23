public class Team {
    private int goalResults;
    private int points;
    private int matches;
    private String coach;
    private String bestPlayer;



    public void setCoach(String coach) {
        String coachName = coach.substring(0,1).toUpperCase()+ coach.substring(1).toLowerCase();
        if (coachName.equals("Sarri")){
            this.coach= coach;
        } else{
            this.coach = "Unknown coach name";
        }
    }


    public void setBestPlayer(String bestPlayer) {
        if (bestPlayer.equals("Hazard")) {
            this.bestPlayer = bestPlayer;
        } else {
            this.bestPlayer = "Unknown player";
        }
    }

    public String getBestPlayer() {
        return this.bestPlayer;
    }

    public void goalsBalance(int goalsBalance) {
        this.goalResults += goalsBalance;
        System.out.println("Your goalBalance is " + goalsBalance + ". Your goalResults now is " + goalResults);
    }

    public void goalsBalance() {
        System.out.println("Your goalResults now is " + goalResults + " goals.");
    }

    public void goalLost(int goalLost) {
                this.goalResults -= goalLost;
                System.out.println("You lost " + goalLost + " goals. Your goalResults now is " + goalResults + " goals." );
    }

    public void goalScored(int goalScored) {
        this.goalResults += goalScored;
        System.out.println("You scored " + goalScored + " goals. Your goalResults now is " + goalResults + " goals.");
    }


    public void pointSeason(int winMatches, int drawMatches, int loseMatches) {
       this.points = (winMatches * 3 + drawMatches * 1 + loseMatches * 0);
       this.matches = (winMatches + drawMatches + loseMatches);
       System.out.println("You played " + matches + " matches and score " + points + " points.");

    }

    public String getCoach() {
        return this.coach;
    }







}
