package com.moonstone.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account Number must be 10 digits")
    @Schema(
            description = "Account no of the Customer"
    )
    private Long accountNumber;


    @NotEmpty(message = "Account Type can not be null or empty")
    @Schema(
            description = "Account type", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address Type can not be null or empty")
    @Schema(
            description = "Branch address", example = "Savings"
    )
    private String branchAddress;

}
