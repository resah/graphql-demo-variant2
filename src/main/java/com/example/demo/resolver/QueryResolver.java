package com.example.demo.resolver;

import java.io.IOException;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.remote.GhibliApi;
import com.example.demo.remote.Person;

public class QueryResolver implements GraphQLQueryResolver {
	
	GhibliApi ghibliApi;

    public QueryResolver(GhibliApi ghibliApi) {
        this.ghibliApi = ghibliApi;
    }

    public Person getBonkers(String id) throws IOException {
        return ghibliApi.getPerson(id).execute().body();
    }

}
