package com.justinturney.petclinic.services;

import com.justinturney.petclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLikeIgnoreCase(String lastName);


}
