package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.niepracuj.model.dto.application.ApplicationCreateDto;
import pl.niepracuj.model.dto.application.ApplicationDto;
import pl.niepracuj.service.application.ApplicationService;

import java.io.File;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/application")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/create")
    public ApplicationDto createApplication(ApplicationCreateDto applicationCreateDto) throws IOException {
        return applicationService.createApplication(applicationCreateDto);
    }
}