package oopRecap;

public class Main {

	public static void main(String[] args) {
		
		Video video1 = new Video(1, " Engin Demiroð","Yazýlým Geliþtirici Kampý 1.Gün",159,36964);
		
		Video video2 = new Video(2,"Engin Demiroð","Yazýlým Geliþtirici Kampý 2.Gün",151,18696);
		
		User user1 = new User(1,"Mücahit DÜZ");
		User user2 = new User(2,"Efecan BAYAT");
		
		User[] users = {user1,user2};
		
		for (User user : users) {
			System.out.println(user.userName +" canlý yayýna katýldý.");
		}
		
		Video[] videos = {video1,video2};
		
		for (Video video : videos) {
			System.out.println(video.videoName);
		}
		
		VideoManager videoManager = new VideoManager();
		videoManager.subscribeToChannel(video1);
	}

}
