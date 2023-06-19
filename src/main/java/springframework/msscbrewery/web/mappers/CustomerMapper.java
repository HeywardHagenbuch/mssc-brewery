package springframework.msscbrewery.web.mappers;

import springframework.msscbrewery.domain.Customer;
import springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerMapper {

    Customer customerDtoToCustomer(Customer dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
