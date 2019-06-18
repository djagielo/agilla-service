package me.djagielo.agillaservice.tickets.services.impl;

import me.djagielo.agillaservice.tickets.dto.TicketDto;
import me.djagielo.agillaservice.tickets.services.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public TicketDto create(TicketDto ticket) {
        return null;
    }

    @Override
    public Optional<TicketDto> getById(long id) {
        return Optional.empty();
    }

    @Override
    public List<TicketDto> getAll() {
        return null;
    }

    @Override
    public TicketDto update(TicketDto ticket) {
        return null;
    }

    @Override
    public void delete(TicketDto ticket) {

    }

    @Override
    public void delete(long id) {

    }
}
