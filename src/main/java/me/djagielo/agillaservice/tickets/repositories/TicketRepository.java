package me.djagielo.agillaservice.tickets.repositories;

import me.djagielo.agillaservice.tickets.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
