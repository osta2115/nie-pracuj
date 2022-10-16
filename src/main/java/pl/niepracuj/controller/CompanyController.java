package pl.niepracuj.controller;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.model.dto.CompanyDto;
import pl.niepracuj.service.company.CompanyService;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {

    private CompanyService companyService;

    @GetMapping("/all")
    public List<CompanyDto> getCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping("/create")
    public CompanyDto createCompany(@RequestBody CompanyDto companyDto) {
        return companyService.createCompany(companyDto);
    }
}
