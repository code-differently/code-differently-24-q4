package com.codedifferently.lesson17.bank;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
 
class BusinessCheckingAccountTest {

    @Test
    void testConstructorWithBusinessOwner() {
        Set<com.codedifferently.lesson17.bank.Customer> owners = new HashSet<>();
        owners.add(new Customer(UUID.randomUUID(), "John Doe", true)); 
        BusinessCheckingAccount account = new BusinessCheckingAccount("12345", owners, "Tech Corp", 1000.0);
        assertEquals("Tech Corp", account.getBusinessName());
    }

    @Test
    void testConstructorWithoutBusinessOwner() {
        Set<com.codedifferently.lesson17.bank.Customer> owners = new HashSet<>();
        owners.add(new Customer(UUID.randomUUID(), "Jane Doe", false)); 

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BusinessCheckingAccount("12345", owners, "Tech Corp", 1000.0);
        });

        assertEquals("At least one owner must be a business.", exception.getMessage());
    }
}