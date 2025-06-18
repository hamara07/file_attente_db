package com.example.tp_file_attente_db.controller;


import com.example.tp_file_attente_db.dao.ClientRepository;
import com.example.tp_file_attente_db.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
//@RequestMapping("/api/clients")
public class fileController {

    @Autowired
    private ClientRepository clientRepository;

//   @RequestMapping(value = "/")
//   public String app(){
//       return "home";
//   }

    @GetMapping("/clients")
    public String afficherHome(Model model){
        List<Client> clients = clientRepository.clientList();
        model.addAttribute("message", "Bienvenue dans votre salle d'attente");
        model.addAttribute("clients", clients);
        model.addAttribute("client", new Client());
        return "home";
        //Inscription
    }

    @GetMapping("/clients/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("client", new Client());
        model.addAttribute("clients", clientRepository.clientList());
        return "Inscription";
    }

    @PostMapping("/clients/ajouter")
    public String createClient(@ModelAttribute Client client, Model model) {
        clientRepository.create(client);
         model.addAttribute("message", "Client ajouté ");
        model.addAttribute("clients", clientRepository.clientList());
        model.addAttribute("client", new Client());
        return "Inscription";
    }


//    @GetMapping("/")
//    public String afficherFormulaire(Model model) {
//        model.addAttribute("client", new Client()); // client vide pour le formulaire
//        model.addAttribute("liste", listeClients);  // liste actuelle
//        return "home";
//    }
//
//    @PostMapping("/ajouter")
//    public String ajouterClient(@ModelAttribute Client client, Model model) {
//        listeClients.add(client); // ajouter à la liste
//        model.addAttribute("message", "Bienvenue " + client.getNom() + " !");
//        model.addAttribute("liste", listeClients);
//        return "home";
//    }
//@GetMapping("/")
//public String showHome(Model model) {
//    model.addAttribute("client", new Client()); // Pour le formulaire
//    model.addAttribute("clients", clientRepository.clientList()); // Liste des clients
//    return "home";
//}
}
