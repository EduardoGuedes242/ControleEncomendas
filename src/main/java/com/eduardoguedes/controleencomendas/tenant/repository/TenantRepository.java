package com.eduardoguedes.controleencomendas.tenant.repository;

import com.eduardoguedes.controleencomendas.tenant.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
