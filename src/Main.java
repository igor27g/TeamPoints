public class Main {

    public static void main(String[] args) {

        Team chelseaTeam = new Team();


        chelseaTeam.setCoach("Sarri");
        chelseaTeam.setBestPlayer("Hazard");


        chelseaTeam.goalsBalance(0);
        chelseaTeam.goalLost(5);
        chelseaTeam.goalScored(15);
        chelseaTeam.goalLost(10);
        chelseaTeam.goalScored(20);
        chelseaTeam.goalsBalance();
        chelseaTeam.pointSeason(1,1,1);

        System.out.println("The coach is " + chelseaTeam.getCoach() + " and the best player is "  + chelseaTeam.getBestPlayer() + "." );
    }
}
