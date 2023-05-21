package osten.moove.api.company;

public record dataListCompany(Long id, String name, String cnpj) {
    public dataListCompany(Company company){
        this(company.getId(), company.getName(), company.getCnpj());
    }
}
