package osten.moove.api.controller;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import osten.moove.api.company.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class CompanyController {

    @Autowired
    private CompanyRepository repository;

    @PostMapping
    @Transactional
    public void registerCompany(@RequestBody @Valid DataRegisterCompany data){
        repository.save(new Company(data));
    }

    @GetMapping
    public Page<dataListCompany> listCompany(Pageable pageable){
        return repository.findAll(pageable).map(dataListCompany::new);
    }

    @PutMapping
    @Transactional
    public void toUpdateCompany(@RequestBody @Valid toUpdate update){
        var company = repository.getReferenceById(update.id());
        company.toUpdateData(update);
    }

    @DeleteMapping("{id}")
    public void deleteCompany(@PathVariable Long id){
        repository.deleteById(id);
    }
}
