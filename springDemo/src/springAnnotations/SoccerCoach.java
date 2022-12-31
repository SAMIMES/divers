package springAnnotations;

import springDemo.Coach;
import springDemo.FortuneService;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;
    public SoccerCoach(FortuneService sr){
        fortuneService = sr;

    }
    @Override
    public String getDailyWorkout() {
        return "Score a penalty kick";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
