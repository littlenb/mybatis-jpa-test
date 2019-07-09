package com.littlenb.mybatisjpa.demo.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/***
 *
 * @author sway.li
 *
 */
@Entity
@Table(name = "t_sys_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * 用户识别码,唯一
   */
  private String uniCode;

  /**
   * 密码
   */
  @Column(name = "password_encrypt")
  private String password;

  /**
   * 是否授权
   */
  @Column(name = "is_granted")
  private Boolean granted;

  /**
   * 创建时间
   */
  @Column(name = "gmt_create")
  private Date createTime;

  /**
   * 更新时间
   */
  @Column(name = "gmt_modify")
  private Date modifyTime;

  @OneToOne(mappedBy = "user_id")
  private UserArchive archive;

  @OneToMany(mappedBy = "user_id")
  private List<UserRoleRelation> roles;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUniCode() {
    return uniCode;
  }

  public void setUniCode(String uniCode) {
    this.uniCode = uniCode;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getGranted() {
    return granted;
  }

  public void setGranted(Boolean granted) {
    this.granted = granted;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }

  public UserArchive getArchive() {
    return archive;
  }

  public void setArchive(UserArchive archive) {
    this.archive = archive;
  }

  public List<UserRoleRelation> getRoles() {
    return roles;
  }

  public void setRoles(List<UserRoleRelation> roles) {
    this.roles = roles;
  }
}
