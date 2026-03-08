package com.moonstone.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer", example = "Vajira"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min=5, max=30, message="the length of the name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the Customer", example = "lhvajira@gmail.com"
    )
    @NotEmpty(message = "email can not be null or empty")
    @Email(message = "Email should be a valid value")
    private String email;

    @Schema(
            description = "Mobile No of the Customer", example = "947151445888"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digit")
    private String mobileNumber;

    @Schema(
            description = "account details of the Customer", example = "lhvajira@gmail.com"
    )
    private AccountsDto accountsDto;
}
