import lombok.Data;

@Data
public class Account {
    private  Long accountNumber;
    private String accountType;
    private double accountBalance;
    private String accountHolderName;
}
