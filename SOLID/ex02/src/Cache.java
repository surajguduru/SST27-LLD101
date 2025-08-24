public class Cache implements ICache {
    @Override
    public void cache(Frame f) {
        System.out.println("Caching frame of size " + f.getBytes().length + " bytes");
    }
    
}
