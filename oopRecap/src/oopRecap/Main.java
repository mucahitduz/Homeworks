package oopRecap;

public class Main {

	public static void main(String[] args) {
		
		Video video1 = new Video(1, " Engin Demiro�","Yaz�l�m Geli�tirici Kamp� 1.G�n",159,36964);
		
		Video video2 = new Video(2,"Engin Demiro�","Yaz�l�m Geli�tirici Kamp� 2.G�n",151,18696);
		
		User user1 = new User(1,"M�cahit D�Z");
		User user2 = new User(2,"Efecan BAYAT");
		
		User[] users = {user1,user2};
		
		for (User user : users) {
			System.out.println(user.userName +" canl� yay�na kat�ld�.");
		}
		
		Video[] videos = {video1,video2};
		
		for (Video video : videos) {
			System.out.println(video.videoName);
		}
		
		VideoManager videoManager = new VideoManager();
		videoManager.subscribeToChannel(video1);
	}

}
