package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.exception.exceptions.EntityNotFoundException;
import pl.niepracuj.model.dto.LogDto;
import pl.niepracuj.model.dto.advertisement.AdvertisementCreateDto;
import pl.niepracuj.model.dto.advertisement.AdvertisementDto;
import pl.niepracuj.model.dto.advertisement.AdvertisementSearchCriteriaDto;
import pl.niepracuj.service.advertisement.AdvertisementService;
import pl.niepracuj.service.log.LogService;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/adv")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;
    private final LogService logService;

    @GetMapping("/all")
    public List<AdvertisementDto> getAdvertisements() throws IOException, InterruptedException {
        var response = advertisementService.getAllAdvertisements();
        logService.sendLog(LogDto.getLogDto("All advertisement retrieved"));
        return response;
    }

    @GetMapping("/all/company/{companyId}")
    public List<AdvertisementDto> getAdvertisementsForCompany(@PathVariable Long companyId) {
        return advertisementService.getAllAdvertisementsForCompany(companyId);
    }

    @PostMapping("/create")
    public AdvertisementDto createAdvertisement(@RequestBody @Valid AdvertisementCreateDto advertisementCreateDto) throws EntityNotFoundException {
        return advertisementService.createAdvertisement(advertisementCreateDto);
    }

    @PostMapping("/search")
    public List<AdvertisementDto> searchAdvertisementByCriteria(@RequestBody AdvertisementSearchCriteriaDto criteriaDto,
                                                                Pageable pageable) {
        return advertisementService.getAdvertisementsByCriteria(criteriaDto, pageable);
    }
}