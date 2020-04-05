package cn.mailke.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-05 12:52:07
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -22798552376531728L;
    
    private Integer id;
    
    private String username;
    
    private String sex;
    
    private Date birthday;
    
    private String address;
    
    private String password;
}