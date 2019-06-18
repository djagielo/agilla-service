package me.djagielo.agillaservice.tickets.services;

import me.djagielo.agillaservice.tickets.dto.TicketDto;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    TicketDto create(final TicketDto ticket);
    Optional<TicketDto> getById(final long id);
    List<TicketDto> getAll();
    TicketDto update(final TicketDto ticket);
    void delete(final TicketDto ticket);
    void delete(final long id);
}
