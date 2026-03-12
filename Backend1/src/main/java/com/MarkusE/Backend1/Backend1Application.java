package com.MarkusE.Backend1;

import com.MarkusE.Backend1.entity.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Backend1Application {

	public static void main(String[] args) {
		SpringApplication.run(Backend1Application.class, args);
	}

    Member member1 = new Member("Markus", "Emanuelsson", "Korsvägen 16", "markus.emanuelsson@gmail.com", "0768444036", LocalDate.of(1985, 9, 11));
    Member member2 = new Member("Adam", "Olsson", "Korsvägen 16", "adam.olsson@gmail.com", "076345323", LocalDate.of(1988, 5, 22));
    Member member3 = new Member("Kalle", "Andersson", "Korsvägen 16", "kalle.andersson@gmail.com", "073543534", LocalDate.of(1999, 12, 4));
    Member member4 = new Member("Sara", "Eliasson", "Korsvägen 16", "sara.eliasson@gmail.com", "0705345344", LocalDate.of(1987, 2, 16));
    Member member5 = new Member("Thomas", "Nilsson", "Korsvägen 16", "thomas.nilsson@gmail.com", "0734534541", LocalDate.of(1983, 6, 15));

}
