package serenitylabs.tutorials.vetclinic.features.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;

import java.util.Collection;
import java.util.List;

public class TheGuestsOnTheWaitingList implements Question<Collection<Pet>>{

    private final PetHotel petHotel;

    public TheGuestsOnTheWaitingList(PetHotel petHotel) {
        this.petHotel = petHotel;
    }

    @Override
    public Collection<Pet> answeredBy(Actor actor) {
        return petHotel.getWaitingList();
    }

    public static Question<Collection<Pet>> forHotel(PetHotel petHotel) {
        return new TheGuestsOnTheWaitingList(petHotel);
    }
}
