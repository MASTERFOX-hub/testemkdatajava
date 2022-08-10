package com.testemkdata.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Users {
	
	@Id
	@Column
    public long id;

    @Column
    @NotNull(message="{NotNull.User.nome}")
    private String nome;

    @Column
    @NotNull(message="{NotNull.User.personalidade}")
    private String personalidade;
    
    @Column
    @NotNull(message="{NotNull.User.cpf}")
    private String cpf;
    
    @Column
    @NotNull(message="{NotNull.User.rg}")
    private String rg;
    
    @Column
    @NotNull(message="{NotNull.User.cnpj}")
    private String cnpj;
    
    @Column
    @NotNull(message="{NotNull.User.ie}")
    private String ie;

    @Column
    @NotNull(message="{NotNull.User.ativo}")
    private String ativo;

    @Column
    @NotNull(message="{NotNull.User.ddd1}")
    private String ddd1;

    @Column
    @NotNull(message="{NotNull.User.ddd2}")
    private String ddd2;

    @Column
    @NotNull(message="{NotNull.User.ddd3}")
    private String ddd3;
    
    @Column
    @NotNull(message="{NotNull.User.tel1}")
    private String tel1;

    @Column
    @NotNull(message="{NotNull.User.tel2}")
    private String tel2;

    @Column
    @NotNull(message="{NotNull.User.tel3}")
    private String tel3;
    
    @Column
    @NotNull(message="{NotNull.User.data}")
    private String data;

}
