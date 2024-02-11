package CustomSort;

import java.util.Comparator;

public class SortByArtist implements Comparator<Song>{

	@Override
	public int compare(Song song, Song anothersong) {
		// TODO Auto-generated method stub
		
		return -song.getArtist().compareTo(anothersong.getArtist());
	}

}
