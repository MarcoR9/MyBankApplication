package model.service;

import model.dto.LoginDto;

public interface LoginService {

	public boolean authorize(LoginDto login);

}
