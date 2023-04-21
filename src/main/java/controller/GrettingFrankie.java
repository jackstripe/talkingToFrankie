package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import persistency.Greet;
import service.ServicePublisher;

@RestController
public class GrettingFrankie {

    @Autowired
    public ServicePublisher publisher;

    public GrettingFrankie(ServicePublisher publisher){
        this.publisher = publisher;
    }

    @PostMapping("/v1/greet/frankie")
    public void greetFrankie( @RequestBody Greet greet){
        publisher.save(greet);
    }
}
