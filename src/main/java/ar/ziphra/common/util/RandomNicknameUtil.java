package ar.ziphra.common.util;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNicknameUtil {
	
	
	public static List<String> getList(){


		

		ArrayList<String> words = new ArrayList<>(
			    Arrays.asList("Liam","Noah","Owen","Jack","Luke","Mason","Ethan","James","Henry","David","John","Ryan","Mark","Adam","Kyle","Cole","Sean","Nolan","Blake","Max","Eric","Troy","Paul","Joel","Alex","Eli","Zane","Jake","Dean","Gabe","Ryan","Caleb","Tyler","Isaac","Logan","Evan","Ben","Jack","Matt","Zack","Levi","Toby","Finn","Jay","Kyle","Max","Nick","Rob","Sam","Ted","Tom","Van","Wes","Zed","Lux","Zac","Liam","Noah","Owen","Jack","Luke","Mason","Ethan","James","Henry","David","John","Ryan","Mark","Adam","Kyle","Cole","Sean","Nolan","Blake","Max","Eric","Troy","Paul","Joel","Alex","Eli","Zane","Jake","Dean","Gabe","Caleb","Tyler","Isaac","Logan","Evan","Ben","Matt","Zack","Levi","Toby","Finn","Jay","Nick","Rob","Sam","Ted","Tom","Van","Wes","Zed","Lux","Zac","Drew","Chad","Reid","Ezra","Tate","Jude","Rory","Quinn","Miles","Troy","Clark","Seth","Neil","Shawn","Cody","Brent","Bryce","Andy","Brad","Casey","Doug","Frank","Fred","Hank","Ivan","Jace","Joel","Kirk","Lyle","Mick","Nate","Otis","Pete","Ray","Ross","Saul","Tim","Vic","Walt")
			);


		ArrayList<String> emojis = new ArrayList<String>();
		emojis.add("😀");
		emojis.add("😆");
		emojis.add("🤣");
		emojis.add("😇");
		emojis.add("🙃");
		emojis.add("😌");
		emojis.add("🤪");
		emojis.add("🧐");
		emojis.add("😎");
		emojis.add("🥸");
		emojis.add("😖");
		emojis.add("🥵");
		emojis.add("😨");
		emojis.add("😰");
		emojis.add("🤐");
		emojis.add("🤠");
		emojis.add("🤡");
		//emojis.add("💩");
		emojis.add("👽");
		emojis.add("👾");
		emojis.add("🤖");
		emojis.add("🎃");
		emojis.add("🐶");
		emojis.add("🐱");
		emojis.add("🐹");
		emojis.add("🦊");
		emojis.add("🐻");
		emojis.add("🐼");
		emojis.add("🐻‍");
		emojis.add("🐨");
		emojis.add("🐯");
		emojis.add("🦁");
		emojis.add("🐮");
		emojis.add("🐷");
		emojis.add("🐽");
		emojis.add("🐸");
		emojis.add("🐵");
		emojis.add("🍊");
		emojis.add("🍉");
		emojis.add("🍇");
		emojis.add("🍓");
		emojis.add("🫐");
		emojis.add("🍈");
		emojis.add("🍒");
		emojis.add("🍑");
		emojis.add("🥭");
		emojis.add("🥝");
		emojis.add("🍅");
		emojis.add("🍆");
		emojis.add("🥑");
		emojis.add("🌶");
		emojis.add("💪");
		emojis.add("🐌");
		emojis.add("🐜");
		emojis.add("🪰");
		emojis.add("🪲");
		emojis.add("🪳");
		emojis.add("🦟");
		emojis.add("🕷");
		emojis.add("🦂");
		emojis.add("🦝");
		emojis.add("🍀");
		emojis.add("🍫");
		emojis.add("🌭");
		emojis.add("🍔");
		emojis.add("🍟");
		emojis.add("🍕");
		emojis.add("🥕");
		emojis.add("🍩");
		emojis.add("🍪");
		
		Collections.shuffle(words, new Random((new Random()).nextInt(990)));
		Collections.shuffle(words, new Random((new Random()).nextInt(9903)));
		Collections.shuffle(emojis, new Random((new Random()).nextInt(90)));
		Collections.shuffle(emojis, new Random((new Random()).nextInt(94830)));
		Collections.shuffle(words, new Random((new Random()).nextInt(990)));
		Collections.shuffle(words, new Random((new Random()).nextInt(9903)));
		Collections.shuffle(emojis, new Random((new Random()).nextInt(90)));
		Collections.shuffle(emojis, new Random((new Random()).nextInt(94830)));
		Collections.shuffle(words, new Random((new Random()).nextInt(990)));
		Collections.shuffle(words, new Random((new Random()).nextInt(9903)));
		Collections.shuffle(emojis, new Random((new Random()).nextInt(90)));
		Collections.shuffle(emojis, new Random((new Random()).nextInt(94830)));
		List<String> r = new ArrayList<>();
		for (int i = 0 ; i < emojis.size(); i ++) {
			
			r.add(words.get(i).toUpperCase() + "__" + emojis.get(i));
		}
	
		return r;

	}

	public static String get() {
		List<String> l = getList();
		return getList().get(new Random().nextInt(l.size()));
	}
	
// 	public static void main(String[] args) throws Exception {
//		//System.out.println("\uD83D\uDE00");
//		//System.out.println(new String("😁😍😘🤑😛🦝🐃🐁🐘♠️♥️♦️♣️♟️🔥☀️🪐⚙️🗿🇦🇷🇦🇲🇺🇸".getBytes(),"UTF-8"));
//		
//		getList();
//	}
}
