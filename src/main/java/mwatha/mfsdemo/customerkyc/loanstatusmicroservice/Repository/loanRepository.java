package mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Repository;

import mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Model.loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface loanRepository extends CrudRepository<loan, String> {

}

