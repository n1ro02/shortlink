package com.openai.shortlink.admin.test;

public class ShardingSphereTest {
    private static final String SQL = """
            create table t_user_%d\
            (
                id            bigint auto_increment comment 'ID'
                    primary key,
                username      varchar(256) null comment '用户名',
                password      varchar(256) not null,
                real_name     varchar(256) not null comment '真实姓名',
                phone         varchar(126) not null comment '手机号',
                mail          varchar(512) not null comment '邮箱',
                deletion_time bigint       null comment '注销时间戳',
                create_time   datetime     not null comment '创建时间',
                update_time   datetime     not null comment '修改时间',
                del_flag      tinyint(1)   not null comment '删除标识 0：未删除 1：已删除',
                constraint idx_unique_username
                    unique (username)
            );""";
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }

    }
}
