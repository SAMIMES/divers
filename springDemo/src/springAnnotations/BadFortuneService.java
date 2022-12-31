package springAnnotations;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class BadFortuneService implements FortuneService {

    private String [] data = {"random1", "random2", "random3"};
    //create a Random number generator
    private Random random = new Random();
    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = random.nextInt(data.length);
        //System.out.println("My bad fortune index random = "+index);
        return  data[index];
    }
}
