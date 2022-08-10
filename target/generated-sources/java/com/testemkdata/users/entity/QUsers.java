package com.testemkdata.users.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = -1070487805L;

    public static final QUsers users = new QUsers("users");

    public final StringPath ativo = createString("ativo");

    public final StringPath cnpj = createString("cnpj");

    public final StringPath cpf = createString("cpf");

    public final StringPath data = createString("data");

    public final StringPath ddd1 = createString("ddd1");

    public final StringPath ddd2 = createString("ddd2");

    public final StringPath ddd3 = createString("ddd3");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ie = createString("ie");

    public final StringPath nome = createString("nome");

    public final StringPath personalidade = createString("personalidade");

    public final StringPath rg = createString("rg");

    public final StringPath tel1 = createString("tel1");

    public final StringPath tel2 = createString("tel2");

    public final StringPath tel3 = createString("tel3");

    public QUsers(String variable) {
        super(Users.class, forVariable(variable));
    }

    public QUsers(Path<? extends Users> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsers(PathMetadata metadata) {
        super(Users.class, metadata);
    }

}

