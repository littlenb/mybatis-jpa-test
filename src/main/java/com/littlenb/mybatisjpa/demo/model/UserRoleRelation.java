package com.littlenb.mybatisjpa.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sway.li
 **/
@Table(name = "t_relation_user_role")
public class UserRoleRelation {

  @Id
  @GeneratedValue
  private Long id;

  private Long userId;

  private Long roleId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }
}
