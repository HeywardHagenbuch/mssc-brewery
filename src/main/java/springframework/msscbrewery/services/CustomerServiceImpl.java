package springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Heyward Hagenbuch")
                .build();
    }
}
