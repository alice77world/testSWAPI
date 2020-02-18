package JSON;

import SwapiElements.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class JsonReader {
    public List<People> getPeople(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<People>>(){}.getType());
    }

    public List<Films> getFilms(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Films>>(){}.getType());
    }

    public List<Starships> getStarships(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Starships>>(){}.getType());
    }

    public List<Vehicles> getVehicles(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Vehicles>>(){}.getType());
    }

    public List<Species> getSpecies(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Species>>(){}.getType());
    }

    public List<Planets> getPlanets(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Planets>>(){}.getType());
    }
}
