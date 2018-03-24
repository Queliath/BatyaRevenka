package by.riomedia.batya.converter.impl;

import by.riomedia.batya.converter.ClientConverter;
import by.riomedia.batya.dto.ClientDTO;
import by.riomedia.batya.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientConverterImpl implements ClientConverter {

    @Override
    public ClientDTO convertToDTO(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(client.getId());
        clientDTO.setName(client.getName());
        clientDTO.setIconUrl(client.getIconUrl());
        clientDTO.setDescription(client.getDescription());
        return clientDTO;
    }

}
