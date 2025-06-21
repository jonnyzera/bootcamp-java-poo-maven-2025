package com.exemplo.app;

import java.time.LocalDateTime;

import com.exemplo.app.dominio.Bootcamp;
import com.exemplo.app.dominio.Conteudo;
import com.exemplo.app.dominio.Curso;
import com.exemplo.app.dominio.Dev;
import com.exemplo.app.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        // cursoJava.setTitulo("Curso Java");
        // cursoJava.setDescricao("Descrição curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoPython = new Curso();
        // cursoPython.setTitulo("Curso Python");
        // cursoPython.setDescricao("Descrição curso python");
        cursoPython.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        // mentoriaJava.setTitulo("Mentoria Java");
        // mentoriaJava.setDescricao("Descrição mentoria java");
        // mentoriaJava.setData(LocalDateTime.now());

        // System.out.println(cursoJava);
        // System.out.println(cursoPython);
        // System.out.println(mentoriaJava);

        // Conteudo conteudo = new Curso();
        // Conteudo conteudo1 = new Mentoria();
        // conteudo1.calcularXp();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(mentoriaJava);
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudoConcluido());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        Dev devLeh = new Dev();
        devLeh.setNome("Leticia");
        devLeh.inscreverBootcamp(bootcamp);
        devLeh.progredir();
        devLeh.progredir();
        devLeh.progredir();
        devLeh.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Leticia" + devLeh.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Leticia" + devLeh.getConteudoConcluido());
        System.out.println("XP: " + devLeh.calcularTotalXp());
    }
}
