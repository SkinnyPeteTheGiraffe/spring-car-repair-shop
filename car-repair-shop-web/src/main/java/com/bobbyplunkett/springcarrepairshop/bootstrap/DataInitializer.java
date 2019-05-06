package com.bobbyplunkett.springcarrepairshop.bootstrap;

import com.bobbyplunkett.springcarrepairshop.model.Mechanic;
import com.bobbyplunkett.springcarrepairshop.model.Owner;
import com.bobbyplunkett.springcarrepairshop.services.MechanicService;
import com.bobbyplunkett.springcarrepairshop.services.OwnerService;
import com.bobbyplunkett.springcarrepairshop.services.map.MechanicMapService;
import com.bobbyplunkett.springcarrepairshop.services.map.OwnerMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Initializes data on start-up for the Car Repair Shop Application
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final MechanicService mechanicService;

    public DataInitializer(OwnerService ownerService, MechanicService mechanicService) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("╔═[Starting Bootstrap Process...]════╗");
        System.out.println("║ Initializing Owners...             ║");
        // Initialize Owners
        initializeOwners();
        System.out.println("║ Initialized Owners Successfully!   ║");
        System.out.println("║ Initializing Mechanics...          ║");
        // Initialize Mechanics
        initializeMechanics();
        System.out.println("║ Initialized Mechanics Successfully!║");
        System.out.println("╚═[Completed Bootstrap Process!]═════╝");
    }

    private void initializeOwners() {
        //Owners
        Owner oMike = new Owner();
        Owner oCarol = new Owner();

        //Mike
        oMike.setId(1L);
        oMike.setFirstName("Mike");
        oMike.setLastName("Thompson");

        //Carol
        oMike.setId(1L);
        oMike.setFirstName("Carol");
        oMike.setLastName("Williams");

        //Save Owners
        ownerService.save(oMike);
        ownerService.save(oCarol);
    }

    private void initializeMechanics() {
        //Owners
        Mechanic oBilly = new Mechanic();
        Mechanic oTucker = new Mechanic();

        //Mike
        oBilly.setId(1L);
        oBilly.setFirstName("Billy");
        oBilly.setLastName("Tucker");

        //Carol
        oBilly.setId(1L);
        oBilly.setFirstName("Bobby");
        oBilly.setLastName("Tucker");

        //Save Owners
        mechanicService.save(oBilly);
        mechanicService.save(oTucker);
    }

}
