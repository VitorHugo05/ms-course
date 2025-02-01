package com.vitordev.hrworker.config;

import com.vitordev.hrworker.entities.Worker;
import com.vitordev.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception {
        workerRepository.deleteAll();

        Worker wo1 = new Worker(null, "Bob", 200.0);
        Worker wo2 = new Worker(null, "Maria", 300.0);
        Worker wo3 = new Worker(null, "Alex", 250.0);
        workerRepository.saveAll(Arrays.asList(wo1, wo2, wo3));
    }
}
