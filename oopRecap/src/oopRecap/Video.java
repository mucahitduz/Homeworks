package oopRecap;

public class Video {
	
	public Video() {} 
	
	int id;
	String channelName;
	String videoName;
	int videoDuration;
	int views;
	
	public Video(int id,String channelName,String videoName,int videoDuration,int views) {
		this();
		this.id = id;
		this.channelName = channelName;
		this.videoName = videoName;
		this.videoDuration = videoDuration;
		this.views = views;
		
	}
	
	
}
