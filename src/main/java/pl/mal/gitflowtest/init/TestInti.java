package pl.mal.gitflowtest.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestInti implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String s = "dziala";
        String ee = "eeee";
        String bb = "bbbb";

        System.out.println(s + s);
        System.out.println(ee + bb);
        System.out.println(s + s);
    }
}
