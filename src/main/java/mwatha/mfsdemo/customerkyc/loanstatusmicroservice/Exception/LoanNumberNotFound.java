package mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Exception;

import io.swagger.models.auth.In;

public class LoanNumberNotFound extends RuntimeException{
    public LoanNumberNotFound(String loan_id) {
        super("Could not find loan status found for this Number " + loan_id);
    }
}
