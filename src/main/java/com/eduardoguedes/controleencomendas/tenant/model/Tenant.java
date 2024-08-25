package com.eduardoguedes.controleencomendas.tenant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cond$tenants")
public class Tenant {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long tnt_id;
  private String tnt_email;
  private String tnt_name;

  public Tenant() {}

  public Tenant(long tnt_id, String tnt_email, String tnt_name) {
    this.tnt_id = tnt_id;
    this.tnt_email = tnt_email;
    this.tnt_name = tnt_name;
  }

  public Tenant(String tnt_email, String tnt_name) {
    this.tnt_email = tnt_email;
    this.tnt_name = tnt_name;
  }

  public long getTnt_id() {
    return tnt_id;
  }
  public void setTnt_id(long tnt_id) {
    this.tnt_id = tnt_id;
  }

  public String getTnt_email() {
    return tnt_email;
  }
  public void setTnt_email(String tnt_email) {
    this.tnt_email = tnt_email;
  }

  public String getTnt_name() {
    return tnt_name;
  }
  public void setTnt_name(String tnt_name) {
    this.tnt_name = tnt_name;
  }
}
