package serenitylabs.tutorials.vetclinic;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;
import serenitylabs.tutorials.vetclinic.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APetHotel {

    private final static List<String> guests = new ArrayList<>(
            Arrays.asList("Ginger","Fluffy","Spot","Tigger","Paws","Socks",
                    "Lady","Cat","Fuzzball","Oynx","Milo","Oliver","Snowball",
                    "Felix","Gizmo","Tilly","Mittens","Pepper","Salt","Leo"));

    public static APetHotelBuilder called(String name) {
        return new APetHotelBuilder(name);}

    public static class APetHotelBuilder {

        private String name;

        public APetHotelBuilder(String name) {
            this.name = name;
        }

        public PetHotel withResidents(int residents){

            GuestList guestList = new GuestList();
            WaitingList waitingList = new WaitingList();

            for(int x=0; x<residents; x++) {
                guestList.add(new Pet(guests.get(x), Breed.Cat));
            }
            return new PetHotel(name, guestList, waitingList);
        }
    }

}
