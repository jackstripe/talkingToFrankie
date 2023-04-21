package service;

import persistency.Greet;

import java.util.Set;

public class ServicePublisher {

    private Set<Greet> storage;


    public void save(Greet greet){
        this.storage.add(greet);
    }

    private void publish(){
        //To do
        //publish Kafka
    }
}
