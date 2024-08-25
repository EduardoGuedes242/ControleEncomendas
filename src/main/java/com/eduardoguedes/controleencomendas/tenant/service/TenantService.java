package com.eduardoguedes.controleencomendas.tenant.service;

import com.eduardoguedes.controleencomendas.tenant.model.Tenant;
import com.eduardoguedes.controleencomendas.tenant.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TenantService {

  @Autowired
  public TenantRepository tenantRepository;

  public void createTenant(Tenant tenant) {
    tenantRepository.save(tenant);
  }

  public List<Tenant> getAllTenants() {
    return tenantRepository.findAll();
  }

}
