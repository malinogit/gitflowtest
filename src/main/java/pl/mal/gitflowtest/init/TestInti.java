package pl.mal.gitflowtest.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.mal.gitflowtest.NowaKlasa;

@Component
public class TestInti implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String fa = "fafa";
        String fw = "fwfw";
        String s = "dziala";
        String ee = "eeee";
        String bb = "bbbb";
        String tt = "bbbb";

        NowaKlasa nowaKlasa = NowaKlasa.builder().jednoPole("zajebiscie").build();

        System.out.println(tt + s);
        System.out.println(ee + bb);
        System.out.println(fa + fw);
        System.out.println(nowaKlasa);
    }
}
