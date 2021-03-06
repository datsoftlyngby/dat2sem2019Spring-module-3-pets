package dk.cphbusiness.pets.view.commands;

import dk.cphbusiness.pets.model.Pet;
import dk.cphbusiness.pets.control.PetManager;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

class ListCommand implements Command {
  private String target;
  
  ListCommand(String target) {
    this.target = target;
    }

  @Override
  public String execute(HttpServletRequest request, PetManager manager) {
    Collection<Pet> pets = manager.list();
    request.setAttribute("pets", pets);
    return target;
    }
  
  }
