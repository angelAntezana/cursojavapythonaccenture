package com.ejercicios.email;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailApp {
    
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        emails.add("ana@mail.com");
        emails.add("luis@mail.com");
        emails.add("marta@mail.com");
        emails.add("ana@mail.com");
        emails.forEach(IO::println);
        IO.println("Tamaño de la lista de correos: " + emails.size());
        IO.println("Existe el email luis@mail.com: " + emails.contains("luis@mail.com"));
        emails.remove("marta@mail.com");
        emails.forEach(IO::println);
        long numeroEmails = emails.stream().filter(email -> email.endsWith("@mail.com"))
        .count();
        IO.println("Numero de emails que terminan en @mail.com: " + numeroEmails);
        List<String> listEmails = emails.stream().toList();

    }
}
