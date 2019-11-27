package Songs;

import java.util.Comparator;

public class ArtistComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.artist.compareTo(o2.artist);
    }
}
