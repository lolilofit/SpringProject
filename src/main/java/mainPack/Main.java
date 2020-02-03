package mainPack;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.*;


@SpringBootApplication
@EnableJpaRepositories("mainPack.security")
@EntityScan("mainPack.security")
public class Main implements CommandLineRunner {
//public class Main {

    //@Autowired
    //ServiceCustomer serviceCustomer;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        List<Integer> list = new LinkedList<>(linkedList.subList(2, linkedList.size()-1));
        int i = 2;


    }
}
