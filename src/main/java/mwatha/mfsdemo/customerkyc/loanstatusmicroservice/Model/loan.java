package mwatha.mfsdemo.customerkyc.loanstatusmicroservice.Model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
@Entity
@Table(name = "loans", schema = "public")
public class loan {

    //string values
    @Id
    @ApiModelProperty(notes = "the loan_id")
    private String loan_id;
    @ApiModelProperty(notes = "loan status")
    private String status;
    @ApiModelProperty(notes = "customer id number")
    private int id_number;

    //pojos
    public int getId_number()
    {
        return  id_number;
    }
    public void setId_number(int id_number)
    {
        this.id_number = id_number;
    }

    public String getLoan_id()
    {
        return  loan_id;
    }
    public void setLoan_id(String loan_id)
    {
        this.loan_id = loan_id;
    }

    public String getLoanStatus()
    {
        return  status;
    }
    public void setLoanStatus(String loanStatus){
        this.status = loanStatus;
    }

}
