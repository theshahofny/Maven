package org.ssa.ironyard.web;
//
//import java.net.URI;
//import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.ssa.ironyard.web.Animal.Continent;

@RestController
@RequestMapping("/zoo")
public class SSAZooController {

	//	@RequestMapping("/animals/{animal}")
	//	ResponseEntity<Animal> animals(){
	//		return null;
	//		
	//	}

	@RequestMapping("/aardark")
	ResponseEntity<Animal> aardark(){
		Animal aardark = new Animal("aardark");
		aardark.addCon(Continent.Asia);
		aardark.addCon(Continent.NorthAmerica);
		aardark.addCon(Continent.SouthAmerica);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(aardark);
	}

	@RequestMapping("/baboon")
	ResponseEntity<Animal> baboon(){
		Animal baboon= new Animal("baboon");
		baboon.addCon(Continent.Europe);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(baboon);
	}

	@RequestMapping("/chimpanzee")
	ResponseEntity<Animal> chimpanzee(){
		Animal chimpanzee = new Animal("chimpanzee");
		chimpanzee.addCon(Continent.Asia);
		chimpanzee.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(chimpanzee);
	}
	
	@RequestMapping("/donkey")
	ResponseEntity<Animal> donkey(){
		Animal donkey = new Animal("donkey");
		donkey.addCon(Continent.Asia);
		donkey.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(donkey);
	}
	
	@RequestMapping("/elephant")
	ResponseEntity<Animal> elephant(){
		Animal elephant = new Animal("elephant");
		elephant.addCon(Continent.Asia);
		elephant.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(elephant);
	}

	@RequestMapping("/fish")
	ResponseEntity<Animal> fish(){
		Animal fish = new Animal("elephant");
		fish.addCon(Continent.Asia);
		fish.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(fish);
	}
	
	@RequestMapping("/gorilla")
	ResponseEntity<Animal> gorilla(){
		Animal gorilla = new Animal("elephant");
		gorilla.addCon(Continent.Asia);
		gorilla.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(gorilla);
	}
	
	@RequestMapping("/horse")
	ResponseEntity<Animal> horse(){
		Animal horse = new Animal("horse");
		horse.addCon(Continent.Asia);
		horse.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(horse);
	}
	
	@RequestMapping("/iguana")
	ResponseEntity<Animal> iguana(){
		Animal iguana = new Animal("iguana");
		iguana.addCon(Continent.Asia);
		iguana.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(iguana);
	}
	
	@RequestMapping("/jackalope")
	ResponseEntity<Animal> jackalope(){
		Animal jackalope= new Animal("jacaklope");
		jackalope.addCon(Continent.Asia);
		jackalope.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(jackalope);
	}
	
	@RequestMapping("/kangaroo")
	ResponseEntity<Animal> kangaroo(){
		Animal kangaroo= new Animal("kangaroo");
		kangaroo.addCon(Continent.Asia);
		kangaroo.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(kangaroo);
	}
	
	@RequestMapping("/loris")
	ResponseEntity<Animal> loris(){
		Animal loris= new Animal("loris");
		loris.addCon(Continent.Asia);
		loris.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(loris);
	}
	@RequestMapping("/manatee")
	ResponseEntity<Animal> manatee(){
		Animal manatee = new Animal("loris");
		manatee.addFact("Manatees are slippery");
		System.out.println();
		manatee.addCon(Continent.Asia);
		manatee.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(manatee);
	}
	@RequestMapping("/nightingale")
	ResponseEntity<Animal> nightinGale(){
		Animal manatee = new Animal("Nightingale");
		manatee.addCon(Continent.Asia);
		manatee.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(manatee);
	}
	@RequestMapping("/orangatuan")
	ResponseEntity<Animal> orangatuan(){
		Animal manatee = new Animal("orangatuan");
		manatee.addCon(Continent.Asia);
		manatee.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(manatee);
	}
	@RequestMapping("/piranha")
	ResponseEntity<Animal> piranha(){
		Animal piranha = new Animal("piranha");
		piranha.addCon(Continent.Asia);
		piranha.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(piranha);
	}
	@RequestMapping("/quail")
	ResponseEntity<Animal> quail(){
		Animal quail = new Animal("quail");
		quail.addCon(Continent.Asia);
		quail.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(quail);
	}
	@RequestMapping("/rhinoceros")
	ResponseEntity<Animal> rhino(){
		Animal quail = new Animal("rhinoceros");
		quail.addCon(Continent.Asia);
		quail.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(quail);
	}
	@RequestMapping("/squirrel")
	ResponseEntity<Animal> squirrel(){
		Animal squirrel = new Animal("rhinoceros");
		squirrel.addCon(Continent.Asia);
		squirrel.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(squirrel);
	}
	
	@RequestMapping("/treefrog")
	ResponseEntity<Animal> tf(){
		Animal treefrog = new Animal("treefrog");
		treefrog.addCon(Continent.Asia);
		treefrog.addCon(Continent.Austrailia);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(treefrog);
	}
	
	@RequestMapping("/unicorn")
	ResponseEntity<Animal> uni(){
		Animal unicorn = new Animal("unicorn");
		unicorn.addCon(Continent.inYourImagination);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(unicorn);
	}
	
	@RequestMapping("/velociraptor")
	ResponseEntity<Animal> velo(){
		Animal unicorn = new Animal("velociraptor");
		unicorn.addCon(Continent.inYourImagination);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(unicorn);
	}
	
	@RequestMapping("/whale")
	ResponseEntity<Animal> freeWilly(){
		Animal unicorn = new Animal("whale");
		unicorn.addCon(Continent.inYourImagination);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(unicorn);
	}
	
	@RequestMapping("/xray_tetra")
	ResponseEntity<Animal> tetra(){
		Animal unicorn = new Animal("xray_tetra");
		unicorn.addCon(Continent.inYourImagination);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(unicorn);
	}
	
	@RequestMapping("/yack")
	ResponseEntity<Animal> yack(){
		Animal unicorn = new Animal("treefrog");
		unicorn.addCon(Continent.inYourImagination);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(unicorn);
	}
	@RequestMapping("/zebra")
	ResponseEntity<Animal> zebrasauras(){
		Animal unicorn = new Animal("treefrog");
		unicorn.addCon(Continent.inYourImagination);
		return ResponseEntity.ok().header("X-Powered-BY", "SSA Zoo").body(unicorn);
	}
	

}



