package me.djagielo.agillaservice.tickets.mappers;

import me.djagielo.agillaservice.tickets.dto.TicketDto;
import me.djagielo.agillaservice.tickets.entities.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    Ticket toObject(final TicketDto ticketDto);
    TicketDto toDto(final Ticket ticket);
}
