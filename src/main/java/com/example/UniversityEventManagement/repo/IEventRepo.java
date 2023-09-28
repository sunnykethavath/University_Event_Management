package com.example.UniversityEventManagement.repo;

import com.example.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepo extends JpaRepository<Event, Integer> {
    List<Event> findAllByDate(LocalDate date);
}
