public class Cross extends Obstacle {
    private int length;

    Cross(int length) {
        this.length = length;
    }

    @Override
    void doIt(Participant participant) {
        participant.run(length);
    }

    @Override
    void info() {
        System.out.printf("Длина беговой дистанции %d метров\n", length);
    }
}
