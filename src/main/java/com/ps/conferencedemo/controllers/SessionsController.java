package com.ps.conferencedemo.controllers;

import com.ps.conferencedemo.models.Session;
import com.ps.conferencedemo.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // this will respond to payloads incoming and outgoing as JSON REST endpoints
@RequestMapping("/api/v1/sessions") //tells the router what the mapping URL look like. All requests to the url"/api/v1/sessions" will be sent to this controller.
public class SessionsController
{
    @Autowired
    private SessionRepository sessionRepository; // It will create an instance of sessionRepository and put it on to our class.

    // this will return all of the sessions when called.
    @GetMapping
    public List<Session> list() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }

    // By default REST API will return 200 as the response status, for all the calls.
    // We can provide exact response, when the method executes and finishes.

}
