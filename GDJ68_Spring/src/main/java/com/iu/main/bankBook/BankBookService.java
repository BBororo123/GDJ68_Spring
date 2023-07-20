package com.iu.main.bankBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 해당 클래스의 객체 생성
public class BankBookService {
	
	@Autowired // 이 객체로 만든 타입을 알아서 넣는다
	private BankBookDAO bankBookDAO;
	
	public void service() {
		System.out.println("service");
		bankBookDAO.dao();
		
	}

}
