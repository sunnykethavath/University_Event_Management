package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    @Autowired
    IEventRepo eventRepo;

    public void addEvent(Event event) {
        eventRepo.save(event);
    }

    public String updateEvent(Integer id, String eventName) {
        Event event = eventRepo.findById(id).orElse(null);

        if(event != null){
            event.setEventName(eventName);
            eventRepo.save(event);
            return "event updated";
        }
        return "cannot update";
    }

    public String deleteEvent(Integer id) {
        eventRepo.deleteById(id);
        return "event deleted";
    }

    public List<Event> getAllEvents(LocalDate date) {
        return eventRepo.findAllByDate(date);
    }
}
