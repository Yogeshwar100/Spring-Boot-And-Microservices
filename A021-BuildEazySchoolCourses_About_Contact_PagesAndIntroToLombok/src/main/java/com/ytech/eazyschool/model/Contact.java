package com.ytech.eazyschool.model;

import lombok.Data;

@Data
public class Contact {
	/*
	 * Lombok is Java library provides following annotations:
	 * 
	 * @Getter
	 * 
	 * @Setter
	 * 
	 * @NoArgsConstructor
	 * 
	 * @RequiredArgsConstructor
	 * 
	 * @AllArgsConstructor
	 * 
	 * @ToString
	 * 
	 * @EqualsAndHashCode
	 * 
	 * @Data =>> It is the combination of all above annotations
	 * except @NoArgsConstructor and @AllArgsConstructor
	 * 
	 */
	private String name;
	private String mobileNum;
	private String email;
	private String message;

}
