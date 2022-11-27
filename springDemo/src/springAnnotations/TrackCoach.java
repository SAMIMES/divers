package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//register this spring bean automatically
@Component
public class TrackCoach implements Coach {
	@Autowired
	//@Qualifier("badFortuneService")
	private FortuneService badFortuneService;
	//Optional on constructor as of Spring 4.3
	/*@Autowired
	public TrackCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;

	} */
	public TrackCoach(){
		System.out.println("inside my Track Coach constructor");

	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+badFortuneService.getFortune();
	}

	public void doMyStartupStaff(){
		System.out.println("Track coach: Inside my startup INIT method staff");
	}

	public void doMyCleanupStaff(){
		System.out.println("Track coach: Inside my cleanup DESTROY staff");
	}
	/*@Autowired
	public void setFortune(FortuneService fortuneService){
		System.out.println("inside setFortune method to inject my dependency.");
		this.fortuneService = fortuneService;

	}*/


}
