package pl.niepracuj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.exception.exceptions.EntityNotFoundException;
import pl.niepracuj.model.dto.adveritisement.AdvertisementCreateDto;
import pl.niepracuj.model.dto.adveritisement.AdvertisementDto;
import pl.niepracuj.model.dto.adveritisement.AdvertisementSearchCriteriaDto;
import pl.niepracuj.service.advertisement.AdvertisementService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/adv")
@RequiredArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    @GetMapping("/all")
    public List<AdvertisementDto> getAdvertisements() {
        return advertisementService.getAllAdvertisements();
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