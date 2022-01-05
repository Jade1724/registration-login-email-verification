package com.example.registrationloginemailverification.appuser;

import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {

  Optional<AppUser> findByEmail(String email);
}
