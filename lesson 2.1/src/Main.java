import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        ObstacleCourse c = new ObstacleCourse();
        c.info();

        Team team = new Team("Team1");

        team.info();
        c.doIt(team);
        team.showResults();

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        team.info();
        c.doIt(team);
        team.showResults();

    }
}
