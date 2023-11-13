package com.programmers.part4.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    void test() {
        // given
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("Hanna");
        customer.setLastName("Lee");

        // when
        repository.save(customer);

        // then
        Customer entity = repository.findById(1L).get();
        log.info("{} {}", entity.getFirstName(), entity.getLastName());
    }
}
