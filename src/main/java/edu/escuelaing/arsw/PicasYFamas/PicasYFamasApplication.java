package edu.escuelaing.arsw.PicasYFamas;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@SpringBootApplication
@Controller
/**
 * Clase principal donde se implementa el juego
 */

public class PicasYFamasApplication {
	private  String siguiente ="...";
	private String adivinar;
	private String resultado= "...";

	public static void main(String[] args) {

		SpringApplication.run(PicasYFamasApplication.class, args);
	}
	@GetMapping("/")
	public String get(Model model) {
		model.addAttribute("siguiente", siguiente);
		model.addAttribute("adivinar", adivinar);
		model.addAttribute("resultado", resultado);
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, params = { "jugar" })
	public String post(String siguiente) {
		this.siguiente=siguiente;
		jugar();
		return "redirect:/";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, params = { "restaurar" })
	public String restaurar() {
		adivinar= numeroAleatorio();
		siguiente = "...";
		resultado = "...";
		return "redirect:/";
	}

	/**
	 * Metodo donde se implementa las condiciones del juego
	 */
	public void jugar(){
		int picas=0;
		int famas=0;
		if (siguiente!="..."){
			for (int i = 0; i < siguiente.length(); i++) {
				if(adivinar.indexOf(siguiente.charAt(i))==i){
					famas++;
				}else if(adivinar.contains(siguiente.charAt(i)+"")){
					picas++;
				}
			}
			resultado="Picas :"+picas+" Famas: "+famas;
			if(famas==4){
				resultado="El numero que ha adivinado es correcto , el numero a adiviar era: "+ adivinar;
			}
		}
	}

	/**
	 * Metodo que genera el numero a adivinar
	 * @return nuevo
	 */
	public String numeroAleatorio(){
		Random r= new Random();
		int i=1;
		String nuevo=(r.nextInt(8)+1)+"";
		String siguientenuevo=r.nextInt(9)+"";
		while(i<=3){
			while(nuevo.contains(siguientenuevo)){
				siguientenuevo=r.nextInt(9)+"";
			}
			nuevo+=siguientenuevo;
			i++;
		}
		return nuevo;
	}

	public PicasYFamasApplication() {

		adivinar=numeroAleatorio();
	}

	public String getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(String siguiente) {

		this.siguiente = siguiente;
	}

	public String getAdivinar() {

		return adivinar;
	}

	public void setAdivinar(String adivinar) {
		this.adivinar = adivinar;
	}


}
