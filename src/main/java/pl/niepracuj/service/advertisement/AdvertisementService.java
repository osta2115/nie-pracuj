package pl.niepracuj.service.advertisement;

import org.springframework.data.domain.Pageable;
import pl.niepracuj.model.dto.adveritisement.AdvertisementCreateDto;
import pl.niepracuj.model.dto.adveritisement.AdvertisementDto;
import pl.niepracuj.model.dto.adveritisement.AdvertisementSearchCriteriaDto;

import java.util.List;

public interface AdvertisementService {

    List<AdvertisementDto> getAllAdvertisements();

    List<AdvertisementDto> getAdvertisementsByCriteria(AdvertisementSearchCriteriaDto criteriaDto, Pageable pageable);

    AdvertisementDto createAdvertisement(AdvertisementCreateDto createDto);
}