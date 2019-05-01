package com.example.demo.resolver;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.remote.GhibliApi;
import com.example.demo.remote.Person;
import com.example.demo.remote.Species;

public class PersonResolver implements GraphQLResolver<Person> {
	
	GhibliApi ghibliApi;

    public PersonResolver(GhibliApi ghibliApi) {
        this.ghibliApi = ghibliApi;
    }

    public Species getSpecies(Person person) throws IOException, URISyntaxException {
        String speciesRef = person.getSpecies();
        
        URI uri = new URI(speciesRef);
        String[] segments = uri.getPath().split("/");
        String speciesId = segments[segments.length-1];
        
        return ghibliApi.getSpecies(speciesId).execute().body();
    }
}
