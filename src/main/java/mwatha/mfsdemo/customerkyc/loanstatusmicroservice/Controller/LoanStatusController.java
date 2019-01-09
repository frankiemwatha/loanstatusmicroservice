package mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Exception.LoanNumberNotFound;
import mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Model.loan;
import mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Repository.loanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerloan")
@Api(value="customer loan status", description="Operations pertaining to customer loan status")
public class LoanStatusController {

    @Autowired
    private loanRepository loanRepository;
    // Single item
    @ApiOperation(value = "View customer loan status either active or inactive")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved customer loan status"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value ="/{loan_id}", method= RequestMethod.GET,produces = "application/json")
    loan loan(@PathVariable String loan_id) {
        return loanRepository.findById(loan_id)
                .orElseThrow(() -> new LoanNumberNotFound(loan_id));
    }
}
