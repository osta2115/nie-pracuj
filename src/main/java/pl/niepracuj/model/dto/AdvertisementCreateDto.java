package pl.niepracuj.model.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementCreateDto {

    @Size(max = 30, message = "Size can't be bigger than 30 characters")
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Future(message = "Expire date can't be less than current date")
    @DateTimeFormat(pattern = "yyyy-MM-ddThh:mm:ss")
    //TODO Change @DateTimeFormat for @Pattern
    private LocalDateTime expireDate;

    @Min(value = 1, message = "Salary from can't be less than 1")
    @NotNull(message = "Salary from is mandatory")
    private Long salaryFrom;

    @Min(value = 1, message = "Salary from can't be less than 1")
    @NotNull(message = "Salary to is mandatory")
    private Long salaryTo;

    @NotBlank(message = "Description is mandatory")
    private String description;

    @NotNull(message = "Company ID is mandatory")
    private Long companyId;

    @NotNull(message = "Technology ID is mandatory")
    private Long technologyId;

    @NotNull(message = "Seniority ID is mandatory")
    private Long seniorityId;

    @NotNull(message = "City ID is mandatory")
    private Long cityId;

    private Set<SkillCreateDto> skills;
}