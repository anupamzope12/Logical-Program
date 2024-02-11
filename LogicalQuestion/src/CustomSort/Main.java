package CustomSort;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String[] args) {
	Song song1=new Song("Aksar iss duniya mein","adrr",2000);
	Song song2=new Song("jo bhi kasame ","fpoo",2020);
	Song song3=new Song("I love you","svfd",2001);
	Song song4=new Song("Ashiyana","fgr",1999);
	Song song5=new Song("bholi si suart","wrwrf",1998);
	
	ArrayList<Song> musicList=new ArrayList<>();
	musicList.add(song1);
	musicList.add(song2);
	musicList.add(song3);
	musicList.add(song4);
	musicList.add(song5);

	for(Song s:musicList) {
		System.out.println(s);
	}
	// Collections.sort(ls);
	SortByComparator sortbycomparator=new SortByComparator();
	Collections.sort(musicList, new SortByArtist().reversed());
	System.out.println("after sorting");
	for(Song s:musicList) {
		System.out.println(s);
	}

  }
}
