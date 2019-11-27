package Songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class OrderArtist {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("titles.txt"));
            String line;
            ArrayList<Song> songs = new ArrayList<>();
            while ((line=file.readLine())!=null) {
               String[] parts = line.split("/");
                Song song = new Song(parts[0],parts[1]);
                songs.add(song);
            }
            Collections.sort(songs,new ArtistComparator());
            System.out.println(songs);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
