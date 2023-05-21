package osten.moove.api.company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import osten.moove.api.adress.Adress;

@Table(name = "companys")
@Entity(name = "Company")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cnpj;
    @Embedded
    private Adress adress;

    public Company(DataRegisterCompany data) {
        this.name = data.name();
        this.cnpj = data.cnpj();
        this.adress = new Adress(data.adress());
    }

    public void toUpdateData(toUpdate update) {
        if (update.name() != null) {
            this.name = update.name();
        }
        if (update.adress() != null) {
            this.adress.updateAdress(update.adress());
        }
    }
}
