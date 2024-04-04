package rocketseat.com.passin.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rocketseat.com.passin.domain.events.Event;
import rocketseat.com.passin.services.EventService;

import java.util.List;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    @Autowired
    private final EventService service;

    @GetMapping("/{eventIid}")
    public ResponseEntity<String> getEvent(@PathVariable  String eventId){
        this.service.getEventDetail(eventId);
        return ResponseEntity.ok("Sucesso!!!");
    }


}
