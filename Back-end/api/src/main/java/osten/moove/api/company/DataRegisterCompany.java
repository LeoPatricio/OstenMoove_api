package osten.moove.api.company;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import osten.moove.api.adress.DataAdress;

public record DataRegisterCompany(
        @NotBlank
        String name,
        @NotBlank @Pattern(regexp = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})\n")
        String cnpj,
        @NotNull @Valid
        DataAdress adress)
{


}
