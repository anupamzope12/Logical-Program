package NaturalSort_CustomSort;

import java.util.ArrayList;
import java.util.Collections;

public class VideoNo1_1 {
public static void main(String[] args) {
	Song song1=new Song("Aksar iss duniya mein","adrr",2000);
	Song song2=new Song("jo bhi kasame ","fpoo",2020);
	Song song3=new Song("I love you","svfd",2001);
	Song song4=new Song("Ashiyana","fgr",1999);
	Song song5=new Song("bholi si suart","wrwrf",1998);
	
	ArrayList<Song> ls=new ArrayList<>();
	ls.add(song1);
	ls.add(song2);
	ls.add(song3);
	ls.add(song4);
	ls.add(song5);

	for(Song s:ls) {
		System.out.println(s);
	}
	Collections.sort(ls);
	System.out.println("after sorting");
	for(Song s:ls) {
		System.out.println(s);
	}

  }
}
