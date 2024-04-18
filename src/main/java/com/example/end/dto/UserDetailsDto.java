package com.example.end.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY,description = "Unique identifier of the user", example = "1")
    private Long id;

    @Pattern(regexp = "[A-Z][a-z]{3,}")
    @Schema(description = "First name of the user", example = "John")
    private String firstName;

    @Pattern(regexp = "[A-Z][a-z]{3,}")
    @Schema(description = "Last name of the user", example = "Doe")
    private String lastName;


    @NotBlank(message = "Email cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    @Email(message = "Invalid email format")
    @Schema(description = "Email address of the user", example = "john.doe@example.com")
    private String email;

    @NotBlank(message = "Description cannot be blank")
    @Schema(description = "Description of the user", example = "I am a manicure master with 10 years of experience")
    @Size(max = 255, message = "Description cannot be longer than 255 characters")
    private String description;

    @NotBlank(message = "Phone number cannot be blank")
    @Schema(description = "Phone number of the user", example = "+49 176 44545615")
    @Pattern(regexp = "\\+?\\d{1,3}[-\\.\\s]?\\(?(\\d{2,3})\\)?[-\\.\\s]?\\d{1,4}[-\\.\\s]?\\d{1,4}",
            message = "Invalid phone number format")
    private String phoneNumber;

    @NotBlank(message = "Address cannot be blank")
    @Schema(description = "Address of the user", example = "Berlin, Salvador straße 88, 13446")
    @Size(max = 255, message = "Address cannot be longer than 255 characters")
    private String address;

    @NotEmpty(message = "List of categories cannot be blank")
    @Schema(description = "List of category IDs to be added to the user")
    private List<Long> categoryIds;

    @NotEmpty(message = "List of procedures cannot be blank")
    @Schema(description = "List of Category procedures IDs to be added to the user")
    private List<Long> procedureIds;


}
