//___________________________________________________________________________________

package com.aula.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aula.restapi.entidade.Contato;

//___________________________________________________________________________________

public interface RepositorioContato extends JpaRepository< Contato,Long >{
    
}

//___________________________________________________________________________________
