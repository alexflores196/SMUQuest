import java.util.ArrayList;

public class Campus
{
    private final ArrayList<Place> campusLocations;

    public Campus()
    {
        campusLocations = new ArrayList<>();
        createPlaces();
    }

    public void createPlaces()
    {
        Place bishop = new Place("Bishop Boulevard", "admire the campus view", 0);
        Place perkins = new Place("Perkins Boulevard", "visit the chapel", 200);
        Place meadows = new Place("Meadows", "attend a concert", -100);
        Place westcott = new Place("Westcott Field", "cheer for the soccer team", -100);
        Place cox = new Place("Cox School of Business", "take a class", 200);
        Place mcfarlin = new Place("Mcfarlin Auditorium", "watch a show", -100);
        Place dedman = new Place("Deadman Law Library", "study", 200);
        Place dallas = new Place("Dallas Hall", "see the downtown skyline", 0);
        Place fondren = new Place("Fondren Science", "do an experiment", 200);
        Place simmons = new Place("Simmons", "take a class", 200);
        Place hughes = new Place("Hughes-Trigg Student Center", "get a snack", -100);
        Place lyle = new Place("Lyle", "learn Java programming", 200);
        Place moody = new Place("Moody", "watch a basketball game", -100);
        Place residential = new Place("Residential Commons", "take a nap", 0);
        Place ford = new Place("Ford Stadium", "cheer for Mustang football", -100);

        campusLocations.add(bishop);
        campusLocations.add(perkins);
        campusLocations.add(meadows);
        campusLocations.add(westcott);
        campusLocations.add(cox);
        campusLocations.add(mcfarlin);
        campusLocations.add(dedman);
        campusLocations.add(dallas);
        campusLocations.add(fondren);
        campusLocations.add(simmons);
        campusLocations.add(hughes);
        campusLocations.add(lyle);
        campusLocations.add(moody);
        campusLocations.add(residential);
        campusLocations.add(ford);
    }

    public Place getFirstPlace()
    {
        return campusLocations.getFirst();
    }

    public Place getNextPlace(Place location, int roll)
    {
        // Get the current index of the given location
        int currentIndex = campusLocations.indexOf(location);

        // Calculate the new index using the roll value
        int newIndex = (currentIndex + roll) % campusLocations.size();

        // Return the Place instance at the new index
        return campusLocations.get(newIndex);
    }
}
