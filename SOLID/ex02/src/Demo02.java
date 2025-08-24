public class Demo02 {
    public static void main(String[] args) {
        Frame f = new Frame(new byte[]{0,1,2,3,4});
        ICache cache = new Cache();
        Player p = new Player(f, cache);
        p.play();
    }
}
