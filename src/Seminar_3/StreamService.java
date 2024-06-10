package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;

public class StreamService extends StreamComparator {

    ArrayList<Stream> streams = new ArrayList<>();

    public StreamService(ArrayList<Stream> streams) {
        this.streams = streams;
    }

    public void streamSort() {
        Collections.sort(streams, (s1, s2) -> s1.getSize() - s2.getSize());

    }

    public ArrayList<Stream> getStreams() {
        return streams;
    }
}
