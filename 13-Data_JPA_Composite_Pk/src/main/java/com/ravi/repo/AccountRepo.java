package com.ravi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.Account;
import com.ravi.entity.AccountPk;

public interface AccountRepo extends JpaRepository<Account, AccountPk> {

}
