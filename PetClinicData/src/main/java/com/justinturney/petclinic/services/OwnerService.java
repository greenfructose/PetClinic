package com.justinturney.petclinic.services;

import com.justinturney.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
