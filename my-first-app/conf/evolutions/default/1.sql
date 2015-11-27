# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin_user (
  id                        varchar(255) not null,
  role                      varchar(255),
  constraint pk_admin_user primary key (id))
;

create sequence admin_user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists admin_user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists admin_user_seq;

