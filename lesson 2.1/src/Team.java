public class Team {
    private String teamName;
    private Participant[] participants;

    Team(String teamName) {
        this.teamName = teamName;
        this.participants = new Participant[]{
                new Member("P1", Sex.MALE),
                new Member("P2", Sex.MALE),
                new Member("P3", Sex.FEMALE),
                new Member("P4", Sex.FEMALE)};
    }

    Team(String teamName, Participant... competitors) {
        this.teamName = teamName;
        this.participants = competitors;
    }

    Participant[] getParticipants() {
        return participants;
    }

    void info() {
        System.out.printf("\nКоманда %s\n", teamName);
        System.out.println("---------------------------------------------------------");
        for (Participant c :
                participants) {
            c.info();
        }
        System.out.println("---------------------------------------------------------");

    }

    void showResults() {
        System.out.printf("\nРезультаты команды %s:\n", teamName);
        System.out.println("---------------------------------------------------------");
        for (Participant c :
                participants) {
            c.showResults();
        }
        System.out.println("---------------------------------------------------------");
    }

}
