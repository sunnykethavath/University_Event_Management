package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/addEvent")
    public String addEvent(@RequestBody Event event){
        eventService.addEvent(event);
        return "event added";
    }

    @PutMapping("/updateEvent")
    public String updateEvent(@RequestParam Integer id, @RequestParam String event){
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/deleteEvent/id/{id}")
    public String deleteEvent(@PathVariable Integer id){
        return eventService.deleteEvent(id);
    }

    @GetMapping("/getAllEvents/date")
    public List<Event> getAllEvents(@RequestParam LocalDate date){
        return (List<Event>) eventService.getAllEvents(date);
    }
}
