package by.riomedia.batya.controller;

import by.riomedia.batya.converter.ClientConverter;
import by.riomedia.batya.dto.ClientDTO;
import by.riomedia.batya.entity.Client;
import by.riomedia.batya.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientConverter clientConverter;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getClients() {
        List<Client> clients = clientService.getClients();
        List<ClientDTO> clientDTOs = new ArrayList<>(clients.size());
        for (Client client : clients) {
            clientDTOs.add(clientConverter.convertToDTO(client));
        }
        return ResponseEntity.ok(clientDTOs);
    }
}
