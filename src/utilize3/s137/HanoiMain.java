package utilize3.s137;

public class HanoiMain {
    public static void main(String[] args) {
        int tray = 5;
        Hanoi ha = new Hanoi(tray);
        ha.moveHanoi(tray, 'a', 'b', 'c');
    }
}
