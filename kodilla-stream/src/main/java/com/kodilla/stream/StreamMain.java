package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapUser = forum.getUserList()
                .stream().filter(x-> x.getSex()=='M')
                .filter(x->(LocalDate.now().getYear() - x.getBirthDate().getYear() >=20))
                .filter(x->x.getPostsNumber()>=1)
                .collect(Collectors.toMap(x -> x.getId(),x->x));

        mapUser.entrySet().stream()//.map(x->"Key: " + x.getKey() + " value: " + x.getValue())
                .forEach(x->System.out.println("Key : " + x.getKey() + " value: " + x.getValue()));
    }
}
/*
zainicjuje strumień Stream przy pomocy metody stream() kolekcji
odfiltruje tylko tych użytkowników, którzy są mężczyznami,
odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat,
odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post,
przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika,
wyświetli otrzymaną mapę wynikową.
 */