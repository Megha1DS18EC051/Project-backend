package com.finalproject.finalproject.repository;


import com.finalproject.finalproject.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
}
