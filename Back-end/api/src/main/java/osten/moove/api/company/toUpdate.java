package osten.moove.api.company;

import jakarta.validation.constraints.NotNull;
import osten.moove.api.adress.DataAdress;

public record toUpdate(@NotNull Long id, String name, DataAdress adress) {
}
