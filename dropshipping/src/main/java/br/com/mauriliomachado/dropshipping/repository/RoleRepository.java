

package br.com.mauriliomachado.dropshipping.repository;

import br.com.mauriliomachado.dropshipping.model.Role;
import br.com.mauriliomachado.dropshipping.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}