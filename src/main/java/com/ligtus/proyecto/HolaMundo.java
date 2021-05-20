package com.ligtus.proyecto;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import com.ligtus.proyecto.Functions;
 
@RestController
public class HolaMundo {
   @RequestMapping("/")
   public String saludar(){
       return "Esta es tu primera página web backend";
   }
 
   @RequestMapping("/despidete")
   public String despidete(){
       return "Adios amigo";
   }

   @RequestMapping("/contar/{word}")
   public String contar(@PathVariable String word){
       return Functions.countLetters(word);
   }

   @GetMapping("/{word}")
    public String alternarcaps(@PathVariable String word) {
        return Functions.alternateCaps(word);
    }
}
