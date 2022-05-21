package com.rajarshisg.petclinic.services;

import com.rajarshisg.petclinic.model.Owner;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
