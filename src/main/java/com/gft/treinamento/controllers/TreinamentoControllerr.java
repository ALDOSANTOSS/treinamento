package com.gft.treinamento.controllers;

import com.gft.treinamento.entities.Person;
import com.gft.treinamento.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TreinamentoControllerr {

    @RequestMapping(method = RequestMethod.GET, path = "/index")
    public ModelAndView index(@RequestParam(name = "name") String firstName, @RequestParam Integer age) {
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("name", firstName);
        return mv;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public ModelAndView about() {
        System.out.println("Olá cheguei aqui no about");
        return new ModelAndView("about.html");

    }

    @RequestMapping(method = RequestMethod.GET,path = "/person")
    public ModelAndView getPerson() {
        PersonService personService = new PersonService();
        ModelAndView mv = new ModelAndView("person.html");
        Person person = personService.createPerson();
        mv.addObject("person", person);
        return mv;

    }
}
