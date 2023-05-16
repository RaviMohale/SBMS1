package com.ravi;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ravi.entity.Account;
import com.ravi.entity.AccountPk;
import com.ravi.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
					AccountRepo bean = context.getBean(AccountRepo.class);
					// setting composite key value
					
					
					
					 AccountPk pk = new AccountPk(); 
					 pk.setAccId(1234556787);
					  pk.setAccType("saving");
					  
					  // setting entity data... 
					  Account acc= new Account();
					  acc.setHolderName("Ravi");
					  acc.setBranch("Pune");
					  acc.setAccountPk(pk);
					  
					  bean.save(acc);
					  System.out.println("record inserted....");
					 
						
					
					/* AccountPk pk = new AccountPk(); 
					 pk.setAccId(1234556787);
					 pk.setAccType("saving");
					 
					 Optional<Account> findById = bean.findById(pk);
					 if(findById.isPresent()) {
						 System.out.println(findById);
					 }*/
	}

}
