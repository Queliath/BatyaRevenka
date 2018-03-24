package by.riomedia.batya.controller;

import by.riomedia.batya.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/basic-info")
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

    @GetMapping
    public ResponseEntity<Map<String, String>> getBasicInfo() {
        return ResponseEntity.ok(basicInfoService.getBasicInfo());
    }
}
