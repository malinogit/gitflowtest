package pl.mal.gitflowtest.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestInti implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String s = "dziala";
        System.out.println(s + s);
        System.out.println(s + s);
        System.out.println(s + s);
    }
}
