package com.exemplo.app.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {
    LocalDateTime data;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 200;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "mentoria='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
