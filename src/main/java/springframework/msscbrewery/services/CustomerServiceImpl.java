package springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Heyward Hagenbuch")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //ToDo: impl - would add a real impl to update customer
        log.debug("Updating a customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer...");
    }
}
