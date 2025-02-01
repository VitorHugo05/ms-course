package com.vitordev.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitordev.hrpayroll.entities.Payment;
import com.vitordev.hrpayroll.entities.Worker;
import com.vitordev.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workId, int days){
       
        Worker worker = workerFeignClient.findById(workId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
