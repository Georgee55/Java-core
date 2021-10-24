public class Water extends Obstacle {
    private int length;

    Water(int length) {
        this.length = length;
    }

    @Override
    void doIt(Participant participant) {
        participant.swim(length);
    }

    @Override
    void info() {
        System.out.printf("Длина бассейна %d метров\n", length);
    }
}
