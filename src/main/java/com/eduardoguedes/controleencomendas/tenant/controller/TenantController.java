package com.eduardoguedes.controleencomendas.tenant.controller;

import com.eduardoguedes.controleencomendas.tenant.model.Tenant;
import com.eduardoguedes.controleencomendas.tenant.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tenant")
public class TenantController {

  @Autowired
  TenantService tenantService;

  @GetMapping
  public List<Tenant> getAllTenants() {
    return tenantService.getAllTenants();
  }

  @PostMapping
  public String newTenant(Tenant tenant) {
    tenantService.createTenant(new Tenant("teste@gmail.com", "first"));
    return "Usuario criado com sucesso";
  }

}
