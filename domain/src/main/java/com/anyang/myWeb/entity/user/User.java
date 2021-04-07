package com.anyang.myWeb.entity.user;

import java.util.Date;

import com.anyang.myWeb.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
@Data
public class User extends BaseEntity {

  private String userName;
  private String password;
  private Integer sex;
  private Date birthday;
  private String nickName;
  private String mobilePhone;
  private Date regTime;
  private String userPhoto;
}
