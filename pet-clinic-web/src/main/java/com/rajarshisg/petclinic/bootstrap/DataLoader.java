package com.rajarshisg.petclinic.bootstrap;

import com.rajarshisg.petclinic.model.Owner;
import com.rajarshisg.petclinic.model.Vet;
import com.rajarshisg.petclinic.services.OwnerService;
import com.rajarshisg.petclinic.services.VetService;
import com.rajarshisg.petclinic.services.map.OwnerServiceMap;
import com.rajarshisg.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Rajarshi");
        owner1.setLastName("Sengupta");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Pratyayee Deb");
        owner2.setLastName("Purkayastha");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ross");
        vet1.setLastName("Geller");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Phoebe");
        vet2.setLastName("Buffay");
        vetService.save(vet2);
    }
}
