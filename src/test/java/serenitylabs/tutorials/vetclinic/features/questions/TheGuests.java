package serenitylabs.tutorials.vetclinic.features.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import serenitylabs.tutorials.vetclinic.model.Breed;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;

import java.util.List;

@Subject("the pets in the hotel")
public class TheGuests {

    public static TheRegisteredGuests registerdInTheHotel(PetHotel petHotel) {
        return (TheRegisteredGuests) TheRegisteredGuests.in(petHotel);
    }

    public static TheGuestsOnTheWaitingList onTheWaitingListAt(PetHotel petHotel) {
        return (TheGuestsOnTheWaitingList) TheGuestsOnTheWaitingList.forHotel(petHotel);
    }
}