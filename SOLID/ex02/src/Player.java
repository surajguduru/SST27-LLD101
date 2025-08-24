public class Player {
    private Frame last;
    private ICache cache;

    public Player(Frame f, ICache cache) {
        this.last = f;
        this.cache = cache;
    }

    void play(){
        // decode (done in constructor) 

        // draw UI
        System.out.println("\u25B6 Playing " + last.getBytes().length + " bytes");
        
        // cache
        System.out.println("Caching last frame? " + (last!=null));
        cache.cache(last);
    }
}