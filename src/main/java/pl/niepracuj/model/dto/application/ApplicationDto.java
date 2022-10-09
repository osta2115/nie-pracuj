package pl.niepracuj.model.dto.application;

import lombok.*;
import pl.niepracuj.model.dto.adveritisement.AdvertisementDto;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDto {

    private Long id;

    private String name;

    private String surname;

    private String email;

    private String introduction;

    private String path;

    private AdvertisementDto advertisementDto;
}