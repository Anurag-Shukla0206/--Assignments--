package com.anurag.UniversityEventManagement.service;

import com.anurag.UniversityEventManagement.model.Event;
import com.anurag.UniversityEventManagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;


    public String addEvent(Event event) {
        eventRepo.save(event);
        return"Event Added";
    }

    public String UpdateEvent(Long eventId , String location) {
        if(eventRepo.existsById(eventId)){
            Optional<Event> event = eventRepo.findById(eventId);
            Event myevent= event.get();
            myevent.setLocationOfEvent(location);
            eventRepo.save(myevent);
            return "Event Updated";
        }
        else{
            return "Event Id does not exist";
        }
    }

    public String DeleteEvent(Long eventId) {
        if(eventRepo.existsById(eventId)){
            eventRepo.deleteById(eventId);
            return "Event Deleted";
        }
        else{
            return "Event Id does not exist";
        }
    }

    public Iterable<Event> getAllEventByDate(LocalDate date) {
        return eventRepo.getAllEventByDate(date);
    }

    public Iterable<Event> getAllEvents() {
        return eventRepo.findAll();
    }


}
