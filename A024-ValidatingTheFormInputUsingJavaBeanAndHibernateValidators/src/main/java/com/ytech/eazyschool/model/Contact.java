package com.ytech.eazyschool.model;

import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Data
public class Contact {

	/*
	 * Java/Jakarta Bean Validation: Bean validation is the standard for
	 * implementing in the Java ecosystem. related dependency:
	 * spring-boot-starter-validation Two packages are there which includes
	 * validation related annotation: 1) Jakarta validations ->
	 * jakarta.validation.constraints.* 2) Hibernate validations ->
	 * org.hibernate.validator.constraints.* jakarta.validation.constraints.*
	 * 
	 * @Digits
	 * 
	 * @Email
	 * 
	 * @Max
	 * 
	 * @Min
	 * 
	 * @NotBlank: Checks if a given field is not null and trimmed length is greater
	 * than zero.
	 * 
	 * @NotEmpty: Checks if a given field is not null and its size/length is greater
	 * than zero(space allowed).
	 * 
	 * @NotNull: Checks if a given field is not null but allows empty values & zero
	 * elements inside collections.
	 * 
	 * @Pattern
	 * 
	 * @size
	 * 
	 * org.hibernate.validator.constraints.*
	 * 
	 * @creditCardNumber //To validate credit card number format
	 * 
	 * @Length
	 * 
	 * @currency
	 * 
	 * @Range
	 * 
	 * @URL
	 * 
	 * @UniqueElements //On top of collection can be applied
	 * 
	 * @EAN //Article number information validation
	 * 
	 * @ISBN //book number information validation
	 * 
	 * To search library files >> ctr+shift+T To search Application files >>
	 * ctr+shift+R
	 */
	@NotBlank(message = "Name must not be blank")
	@Size(min = 3, message = "Name must be at least 3 characters long")
	private String name;

	@NotBlank(message = "Mobile number must not be blank")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
	private String mobileNum;

	@NotBlank(message = "Email must not be blank")
	@Email(message = "Please provide a valid email address")
	private String email;

	@NotBlank(message = "Subject must not be blank")
	@Size(min = 5, message = "Subject must be at least 5 characters long")
	private String subject;

	@NotBlank(message = "Message must not be blank")
	@Size(min = 10, message = "Message must be at least 10 characters long")
	private String message;
}
