package springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    //it could read something from database, WS ..etc.
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
