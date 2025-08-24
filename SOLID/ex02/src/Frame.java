public class Frame { 
    private byte[] data; 
    Frame(byte[] d) { 
        this.data=d; 
    } 

    public byte[] getBytes() {
        return data;
    }
}
