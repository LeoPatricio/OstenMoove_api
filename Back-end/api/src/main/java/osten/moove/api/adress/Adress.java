package osten.moove.api.adress;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Adress(DataAdress data) {
        this.cep = data.cep();
        this.logradouro = data.logradouro();
        this.numero = data.numero();
        this.complemento = data.complemento();
        this.bairro = data.bairro();
        this.cidade = data.cidade();
        this.estado = data.estado();

    }

    public void updateAdress(DataAdress dataAdress) {
        if(dataAdress.cep() != null){
            this.cep = dataAdress.cep();
        }
        if(dataAdress.logradouro() != null){
            this.logradouro = dataAdress.logradouro();
        }
        if(dataAdress.numero() != null){
            this.numero = dataAdress.numero();
        }
        if(dataAdress.bairro() != null){
            this.bairro = dataAdress.bairro();
        }
        if(dataAdress.cidade() != null){
            this.cidade = dataAdress.cidade();
        }
        if(dataAdress.estado() != null){
            this.estado = dataAdress.estado();
        }

    }
}
