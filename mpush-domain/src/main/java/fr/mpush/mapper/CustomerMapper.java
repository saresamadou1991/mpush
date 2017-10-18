package fr.mpush.mapper;

import fr.mpush.entities.Customer;
import fr.mpush.facade.dto.CustomerDTO;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

@Mapper(withIoC = IoC.SPRING)
public interface CustomerMapper {

    CustomerDTO asCustomerDTO(Customer in);

    List<CustomerDTO> asCustomerDTOList(List<Customer> in);

}