package com.application.adg.Repositories;

import com.application.adg.Models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<Message, Integer> {
}
