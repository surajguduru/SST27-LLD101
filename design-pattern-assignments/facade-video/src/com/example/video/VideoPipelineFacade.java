package com.example.video;

import java.nio.file.Path;


public class VideoPipelineFacade {
    public static Path process(Path input, Path output) {
        Decoder dec = new Decoder();
        
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        LegacySharpen ls = new LegacySharpen();

        Frame[] frames = dec.decode(input);
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, 0.5);
        String handle = "INITIAL_HANDLE";
        handle = ls.applySharpen(handle, 5);
        return enc.encode(frames, output);
    }
}
