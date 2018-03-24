package by.riomedia.batya.converter;

import by.riomedia.batya.dto.ClientDTO;
import by.riomedia.batya.entity.Client;

public interface ClientConverter {
    ClientDTO convertToDTO(Client client);
}
