package CustomSort;

import java.util.Comparator;

public class SortByComparator implements Comparator<Song>{

	@Override
	public int compare(Song song, Song anothersong) {
		//sort all the song object by the year in asc order
		if(song.getYear()>anothersong.getYear()) {
			return +1;
		}
		if(song.getYear()<anothersong.getYear()) {
			return -1;
		}
		return 0;
	}
	

}
