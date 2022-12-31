package springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;

	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}

	public void doMyStartupStaff(){
		System.out.println("Track coach: Inside my startup INIT method staff");
	}

	public void doMyCleanupStaff(){
		System.out.println("Track coach: Inside my cleanup DESTROY staff");
	}

}
