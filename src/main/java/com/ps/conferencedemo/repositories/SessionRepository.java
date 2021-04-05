package com.ps.conferencedemo.repositories;

import com.ps.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

// This gives us find/save/update/delete
public interface SessionRepository extends JpaRepository<Session, Long>
{

}
