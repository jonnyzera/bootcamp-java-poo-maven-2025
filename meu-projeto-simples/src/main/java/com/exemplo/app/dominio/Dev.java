package com.exemplo.app.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    };

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    };

    public double calcularTotalXp() {
        return this.conteudoConcluido
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // Se for o mesmo objeto, returna true
        if (o == null || getClass() != o.getClass())
            return false; // Se o objeto for nulo ou de outra classe, retorna flase
        Dev dev = (Dev) o; // Faz o cast para o Dev
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos)
                && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluido);
    }
}
