/*package mainPack.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


@Component
public class ServiceCustomer {
    CustomerRepository customerRepository;

    @Autowired
    public ServiceCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }
}
*/