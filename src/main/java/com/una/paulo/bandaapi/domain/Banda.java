package com.una.paulo.bandaapi.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Banda implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String nome;

    private int anoDeFormacao;

    private String estiloMusical;

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeFormacao() {
        return anoDeFormacao;
    }

    public void setAnoDeFormacao(int anoDeFormacao) {
        this.anoDeFormacao = anoDeFormacao;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", anoDeFormacao=" + anoDeFormacao +
                ", estiloMusical='" + estiloMusical + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banda banda = (Banda) o;
        return id == banda.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
