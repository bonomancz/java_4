import cz.bonoman.computers.Computers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// ignore *.iml, *.idea

public class Main {

    public static void main(String[] args){
        System.out.println("Computer class sorting in 4th lesson.");
        ArrayList<Computers> computers = new ArrayList<>();

        // define computers
        computers.add(new Computers("IBM", "Recepce",2015, 10, LocalDate.of(2014, 5, 11)));
        computers.add(new Computers("Apple", "Reditel", 2018, 12, LocalDate.of(2017, 10, 6)));
        computers.add(new Computers("Apple", "Assistant1", 2018, 13, LocalDate.of(2017, 10, 6)));
        computers.add(new Computers("Apple", "Assistant2", 2018, 14, LocalDate.of(2017, 10, 6)));
        computers.add(new Computers("Apple", "Assistant3", 2018, 15, LocalDate.of(2017, 10, 6)));
        computers.add(new Computers("Dell", "Office1", 2014, 7, LocalDate.of(2013, 12, 23)));
        computers.add(new Computers("Autocont", "Office2", 2009, 20, LocalDate.of(2007, 6, 10)));
        computers.add(new Computers("HP", "Office3", 2001, 14, LocalDate.of(2001, 7, 5)));

        // output
        for(Computers computer : computers) {
            System.out.println("Description: " + computer.getDescription() + " Brand: " + computer.getBrand() + " Year: " + computer.getYear() + " Weight: " + computer.getWeight());
        }
    }

}
