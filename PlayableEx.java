package OOPSpractise;

interface Playable{
	void play();//abstarct method
}

//implement the interface in video class
class Video implements Playable{
	public void play() {
		System.out.println("Playing video.."); 
	}
}
//implement the interface in audio class
class Audio implements Playable{
	public void play() {
		System.out.println("Playing audio.."); 
	}
}

public class PlayableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playable p1=new Video();
		Playable p2=new Audio();
		
		p1.play();
		p2.play();
	}

}
//Write a program that uses an interface Playable with a method play(),
//and implement it in two classes: Video and Audio.