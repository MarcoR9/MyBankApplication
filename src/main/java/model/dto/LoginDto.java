package model.dto;

import lombok.Data;

@Data
public class LoginDto {

	private int idLogin;
	
	private String email;
	
	private String password;
}
