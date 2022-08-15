package net.xdclass.chapter06.episode06;

public class AbstractTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Auto auto = new Auto();

        bicycle.run();
        bicycle.stop();

        auto.run();
        auto.stop();
    }
}
