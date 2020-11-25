package com.montassar.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.montassar.entities.Developpeur;
import com.montassar.services.DeveloppeurService;

@Controller
public class DeveloppeurController {
@Autowired
DeveloppeurService developpeurService;

@RequestMapping("/showAjout")
public String showAjout()
{
	return "ajoutDeveloppeur";
}

@RequestMapping("/saveDeveloppeur")
public String saveDeveloppeur(@ModelAttribute("developpeur") Developpeur developpeur, 
 @RequestParam("date") String date,
 ModelMap modelMap) throws
ParseException 
{
//conversion de la date 
 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
 Date dateembauche = dateformat.parse(String.valueOf(date));
 developpeur.setDateEmbauche(dateembauche);
 
Developpeur saveDeveloppeur = developpeurService.saveDeveloppeur(developpeur);
String msg ="Developpeur ajouté avec Id "+saveDeveloppeur.getIdDeveloppeur();
modelMap.addAttribute("msg", msg);
return "ajoutDeveloppeur";
}

@RequestMapping("/listeDeveloppeurs")
public String listeDeveloppeurs(ModelMap modelMap)
{
List<Developpeur> devs = developpeurService.getAllDeveloppeurs();
modelMap.addAttribute("developpeurs", devs);
return "listeDeveloppeurs";
}

@RequestMapping("/supprimerDeveloppeur")
public String supprimerDeveloppeur(@RequestParam("id") Long id,
 ModelMap modelMap)
{ 
developpeurService.deleteDeveloppeurById(id);
List<Developpeur> devs = developpeurService.getAllDeveloppeurs();
modelMap.addAttribute("developpeurs", devs);
return "listeDeveloppeurs";
}


@RequestMapping("/modifierDeveloppeur")
public String editerDeveloppeur(@RequestParam("id") Long id,ModelMap modelMap)
{
Developpeur d= developpeurService.getDeveloppeur(id);
modelMap.addAttribute("developpeur", d);
return "editerDeveloppeur";
}

@RequestMapping("/updateDeveloppeur")
public String updateDeveloppeur(@ModelAttribute("developpeur") Developpeur developpeur,
@RequestParam("date") String date,ModelMap modelMap) throws ParseException 
{
	//conversion de la date 
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateEmbauche = dateformat.parse(String.valueOf(date));
	 developpeur.setDateEmbauche(dateEmbauche);
	 
	 developpeurService.updateDeveloppeur(developpeur);
	 List<Developpeur> devs = developpeurService.getAllDeveloppeurs();
	 modelMap.addAttribute("developpeurs", devs);
	return "listeDeveloppeurs";

}
}
