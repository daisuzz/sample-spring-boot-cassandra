package dev.daisuzz.samplespringbootcassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = User.class)
public class SampleSpringBootCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringBootCassandraApplication.class, args);
    }

}
