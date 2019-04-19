package br.com.mauriliomachado.dropshipping.service;

import br.com.mauriliomachado.dropshipping.model.RoleName;
import br.com.mauriliomachado.dropshipping.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;


    public <T> Optional findByName(final RoleName roleAdmin) {
        return roleRepository.findByName(roleAdmin);
    }
}
