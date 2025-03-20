package com.ms.email.ms_email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.ms_email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

    

}
